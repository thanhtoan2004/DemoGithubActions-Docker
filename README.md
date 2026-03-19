# Spring Boot Docker Demo

Dự án mẫu Spring Boot chạy với Docker, tuân thủ các Best Practices.

## Tính năng Mới (v2)
- **Hệ quản trị CSDL kép**: Tích hợp **MySQL 8.0** (persistent storage) và **Redis** (caching).
- **Thanh Toan Intro Page**: Trang giới thiệu bản thân đẹp mắt sử dụng Thymeleaf & CSS hiện đại.
- **Auto-Wait Strategy**: Ứng dụng tự động đợi DB và Redis "Healthy" mới khởi động.

## Cách chạy Toàn bộ Hệ thống
```bash
docker compose up --build
```

## Đưa lên Docker Hub

Để chia sẻ image của bạn với thế giới, hãy thực hiện các bước sau (thay `your_username` bằng tên thật của bạn):

1. **Đăng nhập Docker Hub**:
   ```bash
   docker login
   ```

2. **Build và Tag image**:
   ```bash
   docker build -t your_username/spring-demo:v1 .
   ```

3. **Push lên Hub**:
   ```bash
   docker push your_username/spring-demo:v1
   ```

## Truy cập
- **Home Page (Intro)**: [http://localhost:8080](http://localhost:8080)
- **Cấu hình DB (Host)**: MySQL: `localhost:3309` | Redis: `localhost:6382`
- **Chi tiết xem trong**: [docker-compose.yml](file:///d:/DangThanhToan_2280603288/docker-compose.yml)

### 2. Chạy thủ công bằng Docker
```bash
docker build -t spring-demo .
docker run -p 8080:8080 spring-demo
```

### 3. Chạy cục bộ (không dùng Docker)
Nếu bạn đã cài đặt JDK 21 và Maven:
```bash
./mvnw spring-boot:run
```

## Cấu trúc dự án
- `src/main/java/com/example/demo/HelloController.java`: Controller đơn giản.
- `Dockerfile`: Cấu hình build image tối ưu.
- `docker-compose.yml`: Cấu hình chạy cụm dịch vụ.
- `.dockerignore`: Các file không cần thiết khi build Docker.
