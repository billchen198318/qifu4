# qífū-4 K3s 部署手冊 (K3s Deployment Guide)

本文件詳述 qífū-4 系統在 K3s 高可用環境下的建置與部署流程。

## 1. 叢集架構 (Cluster Architecture)

本部署採用 **3 節點 Master HA (Embedded etcd)** 架構，並結合 **Keepalived** 提供 VIP。

### 節點資訊
*   **VIP**: `192.168.10.200` (對外統一口徑)
*   **Node 1**: `192.168.10.1` (Master/Worker, Keepalived Master)
*   **Node 2**: `192.168.10.2` (Master/Worker, Keepalived Backup)
*   **Node 3**: `192.168.10.3` (Master/Worker, Keepalived Backup)
*   **Private Registry**: `192.168.10.99:5000`

## 2. K3s 集群初始化 (Cluster Initialization)

### 第一步：初始化 Node 1 (Cluster Init)
```bash
curl -sfL https://get.k3s.io | sh -s - server \
  --cluster-init \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.1
```

### 第二步：加入 Node 2 與 Node 3
獲取 Node 1 的 Token：`cat /var/lib/rancher/k3s/server/node-token`。
在 Node 2/3 執行：
```bash
curl -sfL https://get.k3s.io | K3S_TOKEN=<TOKEN> sh -s - server \
  --server https://192.168.10.200:6443 \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.[ID]
```

## 3. 私有倉庫配置 (Private Registry)

在三台機器上編輯 `/etc/rancher/k3s/registries.yaml`：
```yaml
mirrors:
  "192.168.10.99:5000":
    endpoint:
      - "http://192.168.10.99:5000"
```
完成後重啟 K3s：`sudo systemctl restart k3s`。

## 4. 應用程式部署 (Application Deployment)

應用程式運行於 `qifu4` namespace。

### HA 策略
*   **Replicas**: 前後端各部署 3 個副本。
*   **Anti-Affinity**: 使用 `podAntiAffinity` 確保副本分散在不同實體節點上，達成真正的硬體級高可用。

### Ingress 與網路流量
*   **Ingress Controller**: 使用 k3s 內建的 Traefik。
*   **HTTPS**: 配置 `qifu4-tls` Secret (Self-signed 證書)。
*   **Middlewares**: 透過 Traefik `Middleware` CRD 處理 CORS 問題。
*   **路徑分流**:
    *   `/` → `qifu4-frontend-service` (Port 8077)
    *   `/api` → `qifu4-backend-service` (Port 8088)

### 部署指令
```bash
# 在 Node 1 執行
kubectl create namespace qifu4
kubectl apply -f k3s-project/
```

## 5. 運維監控 (Operations)

*   **檢查狀態**: `kubectl get pods -n qifu4 -o wide`
*   **滾動更新**: 更新 Deployment YAML 中的 Image Tag 後重新 Apply，K8s 會自動執行無中斷更新。
*   **容錯測試**: 關閉任一 Master 節點，VIP 應自動漂移，且網站服務應保持正常。

---
*詳細 YAML 配置請參考專案根目錄下的 `k3s-project/` 資料夾。*
