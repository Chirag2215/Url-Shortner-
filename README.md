# URL Shortener Service

A simple and efficient backend service that converts long URLs into short, shareable links. Built using Java 17, Spring Boot, and H2 Database.

## Features

- Generate Base62-encoded short URLs
- Redirect from short URLs to original long URLs
- Track click count (analytics)
- RESTful API with Swagger UI
- Testable via Postman

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Swagger UI
- Postman
- Git + GitHub

## Getting Started



1. Build and Run:

./mvnw spring-boot:run

2 Access the Application:
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- H2 Console: http://localhost:8080/h2-console

## API Endpoints

| Method | Endpoint         | Description                  |
|--------|------------------|------------------------------|
| POST   | /api/shorten     | Generate a short URL         |
| GET    | /{shortCode}     | Redirect to original URL     |
| GET    | /api/analytics   | Get click count for all URLs |

## Sample JSON

**Request**

{ "originalUrl": "https://www.example.com/some/very/long/url" }

**Response**

{ "shortUrl": "http://localhost:8080/abc123" }

## Project Structure

src/
├── controller  
├── service  
├── model  
├── repository  
└── config  

## Notes

- Uses in-memory database (H2), data is reset on restart
- For production, replace H2 with MySQL/PostgreSQL and add user auth
- 

