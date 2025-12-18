# Project Overview

This is a Java Spring Boot project that appears to be a backend for an Instagram-like application. It uses Java 21 and Spring Boot 3. It provides a RESTful API for features like user authentication (including JWT and Kakao OAuth), creating and managing posts, commenting on posts, and liking posts. The project uses Spring Data JPA for database interaction and is configured to work with an in-memory H2 database by default, with MySQL as another option. Swagger is integrated for API documentation.

## Building and Running

### Build
The project uses Gradle for dependency management and building. To build the project, run:
```bash
./gradlew build
```

### Run
To run the application, you can use the Spring Boot Gradle plugin:
```bash
./gradlew bootRun
```
The application will start on the port configured in `src/main/resources/application.properties` (default is 8080).

### Test
To run the tests, use:
```bash
./gradlew test
```

## Development Conventions

*   **Lombok:** The project uses Lombok to reduce boilerplate code. Make sure you have the Lombok plugin installed in your IDE.
*   **API Design:** The API is RESTful and uses a consistent response format (`ApiResponse`).
*   **Authentication:** Authentication is handled using JWT. The `JwtAuthenticationFilter` intercepts requests and validates the token.
*   **Database:** The project is configured to use an H2 in-memory database for development. The schema is automatically created on startup (`spring.jpa.hibernate.ddl-auto=create`). It can be configured to use MySQL by changing the `application.properties` file.
*   **API Documentation:** API documentation is available at `/swagger-ui.html` when the application is running.
*   **Environment Variables:** The Kakao OAuth configuration relies on environment variables (`KAKAO_CLIENT_ID`, `KAKAO_CLIENT_SECRET`). Make sure these are set before running the application.
