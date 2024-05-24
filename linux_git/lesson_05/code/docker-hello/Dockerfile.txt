#прописали среду и ее версию
FROM node:alpine
#я уточню что я забирю локально и в каком месте в контейнере это будет хранится
COPY . /app
WORKDIR /app
CMD node app.js
