# Spring Boot AOP Example

This is a simple Spring Boot application demonstrating the use of Spring AOP for logging and dependency injection, along with two API endpoints that return personalized greeting messages.

## APIs

### 1. `GET /api/sayHello`
This endpoint returns a personalized greeting message saying "Hello Java Folks" with a name injected from a Spring Bean.

**Response:**
```json
{
  "message": "Hello Java Folks, From Subhradeep Ray"
}

### 2. `GET /api/sayBye`
This endpoint returns a personalized greeting message saying "Bye Java Folks" with a name injected from a Spring Bean.

**Response:**
```json
{
  "message": "Bye Java Folks, From Subhradeep Ray"
}
