# K3s Keepalived 替換為 kube-vip 指南

本文件說明如何將原本在 OS 層運行的 `keepalived` 替換為 Kubernetes 原生的 `kube-vip` 方案，以維護 VIP (`192.168.10.200`)。

## 1. 替換思路分析

*   **現狀**：透過 OS 的 `keepalived.service` 維護 VIP。
*   **目標**：透過 Kubernetes `DaemonSet` 運行 `kube-vip` 接管 VIP。
*   **優點**：配置與叢集同步、不需維護宿主機服務、具備原生 K8s 監控。

---

## 2. 實作步驟 (針對全新建置)

如果您是正在建置 K3s 叢集，為了避免「Node 2 加入時 VIP 還沒出現」的問題，請採用 **Static Pod** 方式。

### 第一步：安裝 Node 1 並初始化叢集
執行您原本的 Node 1 安裝指令：
```bash
curl -sfL https://get.k3s.io | sh -s - server \
  --cluster-init \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.11
```

### 第二步：在 Node 1 配置 kube-vip Static Pod
這是關鍵！K3s 會自動啟動位於此目錄下的 Pod，即使叢集還沒完整建立。

1. **建立目錄**：
   ```bash
   sudo mkdir -p /var/lib/rancher/k3s/agent/pod-manifests/
   ```
2. **產出 kube-vip 清單**：
   您可以直接將下方的 YAML 內容存為 `/var/lib/rancher/k3s/agent/pod-manifests/kube-vip.yaml`。

```yaml
apiVersion: v1
kind: Pod
metadata:
  name: kube-vip
  namespace: kube-system
spec:
  containers:
  - args:
    - manager
    env:
    - name: vip_arp
      value: "true"
    - name: vip_interface
      value: eth0 # <--- 修改為您的網卡
    - name: vip_address
      value: 192.168.10.200
    - name: vip_cidr
      value: "32"
    - name: cp_enable
      value: "true"
    - name: cp_namespace
      value: kube-system
    - name: vip_leaderelection
      value: "true"
    - name: vip_leaseduration
      value: "5"
    - name: vip_renewdeadline
      value: "3"
    - name: vip_retryperiod
      value: "1"
    - name: address
      value: 192.168.10.200
    image: ghcr.io/kube-vip/kube-vip:v0.8.2
    imagePullPolicy: IfNotPresent
    name: kube-vip
    resources: {}
    securityContext:
      capabilities:
        add:
        - NET_ADMIN
        - NET_RAW
        - SYS_TIME
  hostNetwork: true
```

3. **檢查 VIP**：
   稍等幾秒後，在 Node 1 執行 `ip addr show`，您應該會看到 `192.168.10.200` 已經掛載在網卡上。

### 第三步：安裝 Node 2 與 Node 3
現在 VIP 已經存在，您可以放心地將 `--server` 指向 VIP：

```bash
curl -sfL https://get.k3s.io | K3S_TOKEN=<TOKEN> sh -s - server \
  --server https://192.168.10.200:6443 \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.12
```

---

## 3. 如果是從現有 Keepalived 遷移 (已有叢集)

如果您目前的叢集已經跑起來了（Node 2/3 已經加入），則不需要使用 Static Pod，可以直接部署 **DaemonSet**。

1. **部署 RBAC**：`kubectl apply -f https://kube-vip.io/manifests/rbac.yaml`
2. **停用各機 keepalived**：`sudo systemctl stop keepalived`
3. **部署 kube-vip DaemonSet** (如前一版本所述)。

由於叢集已建立，各節點的 `etcd` 已經知道彼此，即便 VIP 暫時中斷幾秒，`kube-vip` 啟動後就會立即接手該 IP。

---

## 3. 驗證與檢查

1.  **檢查 Pod 狀態**：
    ```bash
    kubectl get pods -n kube-system -l name=kube-vip-ds
    ```
2.  **檢查 IP 是否掛載**：
    在持有 VIP 的節點執行：
    ```bash
    ip addr show
    ```
    您應該能在指定的網卡下看到 `192.168.10.200/32`。
3.  **測試連線**：
    存取 `https://192.168.10.200` 確認 Traefik Ingress 運作正常。

## 4. 注意事項
*   **K3s 配置不需要修改**：因為您的 `config.yaml` 已經設定了 `tls-san: 192.168.10.200`，證書依然有效。
*   **網卡名稱**：如果三台機器的網卡名稱不一致，建議使用 `Static Pod` 方式部署或為不同節點設定 label。若一致，使用 `DaemonSet` 最為方便。

---

## 5. 進階：kube-vip 的 L4 Load Balancer 功能

除了維護 Control Plane 的 VIP，`kube-vip` 還具備強大的 **L4 Load Balancer** 功能。

### 什麼是 L4 Load Balancer？
*   **Layer 4**：處理 TCP/UDP 流量（與 Traefik 處理 HTTP/HTTPS 的 Layer 7 不同）。
*   **自動分派 IP**：當您在 K3s 中建立 `type: LoadBalancer` 的 Service 時，`kube-vip` 可以自動從預設的 IP 範圍中分派一個獨立 IP 給該服務。
*   **適用場景**：資料庫 (MySQL/PostgreSQL)、MQTT、Redis 等非 HTTP 協議服務，或是您希望某個網站擁有獨立的實體 IP。

### 如何啟用？
1. **安裝 Cloud Provider 插件**：
   ```bash
   kubectl apply -f https://raw.githubusercontent.com/kube-vip/kube-vip-cloud-provider/main/manifest/kube-vip-cloud-provider.yaml
   ```
2. **定義 IP 範圍**：透過 ConfigMap 設定可用 IP 區段（例如 `192.168.10.201-192.168.10.210`）。

---

## 6. 為什麼 kube-vip 比 keepalived 更好？ (架構分析)

在 Kubernetes 生態系中，`kube-vip` 理論上優於傳統的 `keepalived`，原因如下：

### 1. 雲原生整合 (Cloud Native)
*   **keepalived**：設計於 Linux OS 層級，不感知 Pod 與 Node 的運行狀態。
*   **kube-vip**：與 Kubernetes API Server 深度整合，能精準監控控制平面組件的健康狀態，並依此觸發 VIP 漂移。

### 2. 簡化基礎設施維護
*   **keepalived**：需要在宿主機安裝套件並維護 `/etc/keepalived/keepalived.conf`。
*   **kube-vip**：完全透過 YAML 定義。配置可版本化管理 (GitOps)，不需要動到作業系統檔案，重灌機器後一鍵復原。

### 3. 功能合一
*   `kube-vip` = **HA VIP (控制平面高可用)** + **Load Balancer (服務負載平衡器)**。
*   使用一個組件就能解決所有 Bare-metal 環境下的網路高可用與流量入口問題。

### 4. 避免腦裂與選主優勢
*   `kube-vip` 使用 Kubernetes 的 `Lease` 機制進行選主，在複雜的叢集網路中比 `keepalived` 的 VRRP 協議更不容易發生 IP 衝突。

### 總結
對於 **QIFU4** 這種現代化的微服務專案，使用 `kube-vip` 能讓叢集更「自給自足」，減少對宿主機環境的依賴，是更符合當前技術趨勢的選擇。
