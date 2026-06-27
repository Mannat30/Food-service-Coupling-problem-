# 🍔 Food Service Coupling

A Spring Boot REST API for managing food services, restaurants, menu items, customers, and orders. This project demonstrates clean architecture using layered design, DTOs, MapStruct, Spring Data JPA, and RESTful APIs.

---

## 🚀 Features

- 👤 Customer Management
- 🍽️ Restaurant Management
- 📋 Menu Management
- 🛒 Food Ordering
- 📦 Order Tracking
- ✅ CRUD Operations
- 🔍 Search & Filter
- 📊 Exception Handling
- 🛡️ Validation
- 📄 REST APIs

---

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MapStruct
- Lombok
- Maven

### Database
- MySQL

### Tools
- IntelliJ IDEA
- Postman
- Git
- GitHub

---

## 📂 Project Structure

```
src
│
├── controller
├── service
│   ├── impl
│   └── interfaces
├── repository
├── entity
├── dto
├── mapper
├── exception
├── config
└── util
```

---

## 📌 API Modules

### Customer APIs
- Create Customer
- Get Customer
- Update Customer
- Delete Customer

### Restaurant APIs
- Add Restaurant
- View Restaurants
- Update Restaurant
- Delete Restaurant

### Menu APIs
- Add Food Item
- Update Food Item
- Delete Food Item
- Get Menu

### Order APIs
- Place Order
- Cancel Order
- View Orders
- Order History

---

## 🗄️ Database

Configure your database in:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/food_service
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Run the Project

### Clone Repository

```bash
git clone https://github.com/your-username/food-service-coupling.git
```

### Navigate

```bash
cd food-service-coupling
```

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

---

## 📮 Testing APIs

Use **Postman** to test the REST endpoints.

Example:

```
GET    /api/customers
POST   /api/customers
PUT    /api/customers/{id}
DELETE /api/customers/{id}
```

---

## 🧪 Validation

- Bean Validation
- Request Validation
- Global Exception Handling
- Proper HTTP Status Codes

---

## 📖 Architecture

```
Controller
     │
     ▼
Service
     │
     ▼
Repository
     │
     ▼
Database
```

---

## ✨ Future Enhancements

- JWT Authentication
- Spring Security
- Payment Gateway
- Email Notifications
- Docker Support
- Microservices Architecture
- Redis Caching
- Swagger Documentation

---

## 👨‍💻 Author

**Mannat**

Java Full Stack Developer

- Java
- Spring Boot
- MySQL
- Hibernate
- REST API
- React (Frontend)

---

## 📜 License

This project is developed for learning purposes and is free to use.
