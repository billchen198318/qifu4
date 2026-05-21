FROM node:20-alpine

# 設定工作目錄
WORKDIR /src

# 先複製 package.json 以利用 Docker Layer Cache，加速後續打包
COPY package*.json ./
RUN npm install

# 複製其餘原始碼
COPY . .

# 執行編譯 (Nuxt 3 會產出 .output 目錄)
RUN npx nuxi build

# 關鍵環境變數
# NITRO_PORT 是 Nitro 引擎專用的，加上 PORT 是為了雙重保險
ENV NITRO_PORT=8077
ENV PORT=8077
ENV HOST=0.0.0.0
ENV NODE_ENV=production

# 告知 Docker 容器會使用哪個埠位 (僅供參考用)
EXPOSE 8077

# 啟動生產環境伺服器
CMD ["node", ".output/server/index.mjs"]