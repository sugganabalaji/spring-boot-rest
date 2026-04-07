# Job Portal REST API

A Spring Boot REST API implementation for a Job Portal application.  
This project demonstrates modern backend practices with **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**, providing endpoints for job listings, applications, and user management.

---

## 🚀 Features
- RESTful APIs for job postings, applications, and user profiles
- CRUD operations for jobs and applicants
- Authentication & authorization with Spring Security (optional)
- PostgreSQL integration with JPA/Hibernate
- Maven build and dependency management
- Clean, modular project structure

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Spring Security** (optional)

---

## ⚙️ Setup & Run

1. **Clone the repo**
```bash
   git clone https://github.com/sugganabalaji/spring-boot-rest.git
   cd spring-boot-rest
```
2. **Configure PostgreSQL**
- Create a Schema (e.g., Dev)
- Update application-dev.yml:
```yaml
    spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/Dev
        username: postgres
        password: root
        driver-class-name: org.postgresql.Driver
        
      jpa:
        hibernate:
            ddl-auto: update
        show-sql: true
```
3. **Build and run**
```bash
    mvn clean install
    mvn spring-boot:run
```
4. **📂 Project Structure**
```
    src/**
    └── main/
    ├── java/
    │   └── com.app.jobportal
    │       ├── model/        # JPA Entities (JobPost)
    │       ├── repository/    # Spring Data JPA Repositories
    │       ├── service/       # Business Logic
    │       ├── controller/    # REST Controllers
    │       └── SpringBootRestApplication.java # Entry point
    └── resources/
    └── application.yaml
```
**🎯 API Endpoints (Sample)**
- POST /jobPost → Create a new job posting
- GET /jobPosts → List all jobs
- GET /jobPost/{postId} → Get job details
- PUT /jobPost → Update job details
- DELETE /jobPost/{postId} → Delete a Job
- GET /loadData → Load Jobs data
