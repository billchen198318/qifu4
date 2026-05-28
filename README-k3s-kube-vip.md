# K3s HA Cluster 部署指南 (kube-vip + Traefik)

本指南介紹如何使用 kube-vip、K3s 內嵌 etcd HA、Traefik Ingress 建立高可用 (HA) 叢集。所有 Manifest 檔案均存放於 `k3s-project/` 目錄。

## 1. 環境說明

| 節點名稱 | IP 地址 | 角色 |
| :--- | :--- | :--- |
| **node1** | 192.168.10.1 | control-plane + worker (Seed) |
| **node2** | 192.168.10.2 | control-plane + worker |
| **node3** | 192.168.10.3 | control-plane + worker |

*   **Virtual IP (VIP)**: `192.168.10.200` (由 kube-vip 管理)
*   **Private Registry**: `192.168.10.99:5000`
*   **網路卡名稱**: `enp0s8`

---

## STEP 1 — 主機前置設定 (三台皆須執行)

```bash
# 1. 安裝必要套件
sudo apt update && sudo apt install -y curl vim wget net-tools ca-certificates gnupg lsof

# 2. 關閉 Swap
sudo swapoff -a && sudo sed -i '/swap/d' /etc/fstab

# 3. 開啟核心參數
cat <<EOF | sudo tee /etc/modules-load.d/k8s.conf
overlay
br_netfilter
EOF
sudo modprobe overlay && sudo modprobe br_netfilter

cat <<EOF | sudo tee /etc/sysctl.d/k8s.conf
net.bridge.bridge-nf-call-iptables=1
net.ipv4.ip_forward=1
net.bridge.bridge-nf-call-ip6tables=1
EOF
sudo sysctl --system
```

---

## STEP 2 — 初始化 K3s HA 叢集

### 2-1 初始化 Node1 (Seed)
```bash
curl -sfL https://get.k3s.io | sh -s - server \
  --cluster-init \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.1 \
  --write-kubeconfig-mode 644
```

### 2-2 啟動 Bootstrap VIP (Node1)
為了讓其他節點能連上 VIP 加入叢集，先手動建立 Static Pod：
```bash
sudo mkdir -p /var/lib/rancher/k3s/agent/pod-manifests
sudo cp k3s-project/kube-vip-static.yaml /var/lib/rancher/k3s/agent/pod-manifests/kube-vip.yaml
```

### 2-3 加入 Node2 與 Node3
取得 Token 後在 Node2/3 執行：
```bash
# 取得 TOKEN (在 node1)
sudo cat /var/lib/rancher/k3s/server/node-token

# 在 Node2/3 執行 (替換 <TOKEN>)
curl -sfL https://get.k3s.io | K3S_TOKEN=<TOKEN> sh -s - server \
  --server https://192.168.10.200:6443 \
  --tls-san 192.168.10.200 \
  --write-kubeconfig-mode 644
```

---

## STEP 3 — 升級 kube-vip 為正式 HA (DaemonSet)

當三台節點都加入後，將 VIP 管理權轉交給 DaemonSet。

```bash
# 1. 安裝 RBAC
kubectl apply -f https://kube-vip.io/manifests/rbac.yaml

# 2. 部署 DaemonSet
kubectl apply -f k3s-project/kube-vip-ds.yaml

# 3. 移除 Node1 的 Static Pod (等 10 秒後)
sudo rm -f /var/lib/rancher/k3s/agent/pod-manifests/kube-vip.yaml
```

---

## STEP 4 — 私有倉庫與環境配置 (三台皆須執行)

1.  **Registry 設定**: 編輯 `/etc/rancher/k3s/registries.yaml`
    ```yaml
    mirrors:
      "192.168.10.99:5000":
        endpoint: ["http://192.168.10.99:5000"]
    ```
2.  **重啟服務**: `sudo systemctl restart k3s`
3.  **建立 Namespace**: `kubectl create namespace qifu4`
4.  **建立 TLS Secret**:
    ```bash
    openssl req -x509 -nodes -days 3650 -newkey rsa:2048 \
      -keyout tls.key -out tls.crt -subj "/CN=192.168.10.200"
    kubectl create secret tls qifu4-tls --cert=tls.crt --key=tls.key -n qifu4
    ```

---

## STEP 5 — 部署 QIFU4 應用程式

依序執行以下指令部署所有資源：

```bash
cd k3s-project/

# 1. 部署 Middleware (CORS)
kubectl apply -f cors-middleware.yaml

# 2. 部署 Backend (Deployment + Service)
kubectl apply -f backend-deployment.yaml
kubectl apply -f backend-service.yaml

# 3. 部署 Frontend (Deployment + Service)
kubectl apply -f frontend-deployment.yaml
kubectl apply -f frontend-service.yaml

# 4. 部署 Ingress (Route)
kubectl apply -f ingress.yaml
```

---

## STEP 6 — 驗證與 HA 測試

1.  **狀態檢查**:
    *   `kubectl get nodes` (應看到 3 台 Ready)
    *   `kubectl get pods -n qifu4 -o wide` (Pod 應均勻分散)
2.  **訪問測試**: 瀏覽器打開 `https://192.168.10.200`
3.  **Failover 測試**:
    *   關閉目前持有 VIP 的節點 (`sudo shutdown -h now`)。
    *   觀察 `ping 192.168.10.200` 是否自動恢復。
    *   確認網站與 API 依然正常運作。
