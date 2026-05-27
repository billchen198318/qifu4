# qífū-4 K3s 建置與部署手冊

本文件詳述 qífū-4 系統在 K3s 高可用集群上的初始化、配置及自動化部署流程。

## 1. 基礎設施架構 (HA Cluster)

*   **節點配置**:
    *   Node 1: `192.168.10.1` (Init Master + Worker)
    *   Node 2: `192.168.10.2` (Master + Worker)
    *   Node 3: `192.168.10.3` (Master + Worker)
*   **高可用機制**:
    *   **VIP (Virtual IP)**: `192.168.10.200` (由 Keepalived 管理)。
    *   **Database**: 內置 Embedded etcd。
*   **Docker Registry**: `192.168.10.99:5000` (Private Registry)。

## 2. K3s 集群初始化

### 2.1 第一台節點 (Node 1)
```bash
curl -sfL https://get.k3s.io | sh -s - server \
  --cluster-init \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.1
```

### 2.2 加入後續節點 (Node 2 & 3)
讀取 Node 1 的 Token 後執行：
```bash
curl -sfL https://get.k3s.io | K3S_TOKEN=<TOKEN> sh -s - server \
  --server https://192.168.10.200:6443 \
  --tls-san 192.168.10.200 \
  --node-ip <NODE_IP>
```

## 3. 私有倉庫配置 (`registries.yaml`)
在所有節點上建立 `/etc/rancher/k3s/registries.yaml` 以支援私有 Registry：
```yaml
mirrors:
  "192.168.10.99:5000":
    endpoint:
      - "http://192.168.10.99:5000"
```
完成後重啟服務：`sudo systemctl restart k3s`。

## 4. 系統部署 (Deployment)

系統部署於 `qifu4` Namespace，包含以下組件：

### 4.1 後端 (qifu4-backend)
*   **Replica**: 3 (分散部署於 3 台機器)。
*   **Port**: 8088。
*   **Anti-Affinity**: 確保 Pod 不會擠在同一台實體機。
*   **Probes**: 包含 Liveness 與 Readiness 探針，確保服務可用性。

### 4.2 前端 (qifu4-frontend)
*   **Replica**: 3。
*   **Port**: 8077。
*   **Strategy**: `Recreate` 確保更新時舊版本完全清除。

### 4.3 網絡入口 (Ingress & Middleware)
*   **Ingress Controller**: Traefik。
*   **HTTPS**: 使用自簽憑證 (`qifu4-tls`) 提供 TLS 保護。
*   **CORS**: 透過 Traefik Middleware (`qifu4-cors-middleware`) 處理跨域資源共享。
*   **路由規則**:
    *   `/api` -> 後端服務。
    *   `/` -> 前端服務。

## 5. 部署指令參考

```bash
# 建立 Namespace
kubectl create namespace qifu4

# 套用部署檔
kubectl apply -f backend-deployment.yaml
kubectl apply -f backend-service.yaml
kubectl apply -f frontend-deployment.yaml
kubectl apply -f frontend-service.yaml
kubectl apply -f cors-middleware.yaml
kubectl apply -f ingress.yaml
```

## 6. 維護與監控
*   檢查 Pod 狀態: `kubectl get pods -n qifu4 -o wide`。
*   查看日誌: `kubectl logs -f <pod-name> -n qifu4`。
*   滾動更新: 修改 YAML 中的 Image Tag 後重新執行 `kubectl apply`。
