# YSAir Airline Reservation Management System

YSAir is a Spring Boot airline reservation application for searching flights, viewing trip details, booking tickets, processing demo payments, and viewing booking confirmations.

## Features

- User registration and login
- Flight search with airport suggestions
- Fare estimation and trip details
- Flight selection and ticket booking
- Demo payment and booking confirmation flow
- Admin pages for flight, passenger, booking, and profile management
- MySQL database integration

## Technology

- Java 17+
- Spring Boot 3
- Spring Security with JWT authentication
- Spring Data JPA and Hibernate
- MySQL
- Thymeleaf, HTML, CSS, and JavaScript
- Maven

## Requirements

- JDK 17 or newer
- MySQL 8 or newer
- Git

## Clone the repository

```bash
git clone https://github.com/YashasviSharma11/Airline-Reservation-Management-System.git
cd Airline-Reservation-Management-System
```

## Configure the environment

Copy `.env.example` to `.env` and update the database password:

```text
MYSQL_USERNAME=root
MYSQL_PASSWORD=your_mysql_password
MYSQL_HOST=localhost
MYSQL_PORT=3306
MYSQL_DATABASE=Airline-Reservation-System
```

`.env` is for local use only and must not be committed to GitHub.

## Run locally

Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

macOS or Linux:

```bash
./mvnw spring-boot:run
```

Open `http://localhost:8080` in a browser. The application creates or updates the configured database tables automatically and seeds sample flights at startup.

## Build the application

```bash
./mvnw clean package
```

The generated JAR file is placed in the `target` directory.

## Deploy

For Railway, Render, or another Java hosting platform, use:

```bash
./mvnw clean package -DskipTests
```

Start the application with:

```bash
java -jar target/ARMS-0.0.1-SNAPSHOT.jar
```

Configure the production MySQL values as environment variables on the hosting platform. Do not upload `.env` or store production passwords in source code.

## Project structure

```text
src/main/java                  Spring Boot backend
src/main/resources/templates   Thymeleaf pages
src/main/resources/static      CSS, JavaScript, and images
src/main/resources/application.properties
schema.sql                     Database schema reference
```

## License

This project is intended for educational and demonstration purposes.
