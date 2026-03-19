@echo off
echo [*] Dang dang nhap vao Docker Hub...
docker login

echo [*] Dang build va tag image: thanhhtoann/spring-demo:v1...
docker build -t thanhhtoann/spring-demo:v1 .

echo [*] Dang push image len Docker Hub...
docker push thanhhtoann/spring-demo:v1

echo [OK] Da hoan thanh! Truy cap: https://hub.docker.com/r/thanhhtoann/spring-demo
pause
