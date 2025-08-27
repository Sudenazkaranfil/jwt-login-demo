# JWT Login Project

## 📌Proje Hakkında
Bu proje, **Spring Boot**, **Spring Security** ve **JWT (JSON Web Token)** kullanarak basit bir kullanıcı kimlik doğrulama sistemi geliştirmeyi amaçlamaktadır.  
Kullanıcılar sisteme kayıt olabilir, giriş yapabilir ve yalnızca JWT token ile yetkilendirilmiş endpointlere erişebilir.

---

## ⚙️Özellikler
- Kullanıcı kayıt (`/api/auth/register`)
- Kullanıcı girişi (`/api/auth/login`) ve JWT token oluşturma
- Token ile korunan profil endpointi (`/api/profile`)
- Hatalı veya geçersiz token ile erişimde yetkisiz hata dönülmesi
- H2 in-memory database ile basit veri saklama

---

## 🛠️Kullanılan Teknolojiler
- Java 17+
- Spring Boot
- Spring Security
- JWT (io.jsonwebtoken)
- H2 Database (In-memory)
- Maven

---

## 🚀 Kurulum ve Çalıştırma
1. Repo klonla:
```bash
git clone https://github.com/Sudenazkaranfil/jwt-login-demo.git
```
2. Proje dizinine gir:
```bash
cd jwt-login-demo
```
3. Maven ile bağımlılıkları indir:
```bash
mvn clean install
```
4. Uygulamayı başlat:
```bash
mvn spring-boot:run
```
5. Tarayıcı veya Postman ile endpointleri test et:
```bash
Kayıt: POST http://localhost:8080/api/auth/register

Giriş: POST http://localhost:8080/api/auth/login

Profil (JWT gerekli): GET http://localhost:8080/api/profile
```
## 📝Notlar

JWT secret ve expiration süresi application.properties dosyasında ayarlanabilir.

Default kullanıcı:

Username: sudenaz

Password: 1234

## 📂Dosya Yapısı
src/

  └─ main/
  
     ├─ java/org/example/
     
     │    ├─ controller/
     
     │    ├─ model/
     
     │    ├─ repository/
     
     │    ├─ security/
     
     │    ├─ service/
     
     │    └─ util/
     
     └─ resources/
     
          └─ application.properties
          

