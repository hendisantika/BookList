# Book List

A Simple Book List application built with Spring Boot, demonstrating CRUD operations with JPA and H2 database.

## Technology Stack

- **Spring Boot**: 3.5.7
- **Java**: 21
- **Database**: H2 (in-memory)
- **ORM**: Hibernate/JPA
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven

## Prerequisites

- Java 21 or higher
- Maven 3.6+

## Features

- View list of books
- In-memory H2 database
- JPA entities with Hibernate
- Thymeleaf templates for web interface
- Bootstrap CSS styling
- H2 Console for database management

## How to Run

### Using Maven:

```bash
mvn clean spring-boot:run
```

### Or build and run the JAR:

```bash
mvn clean package
java -jar target/BookList-0.0.1-SNAPSHOT.jar
```

## Access the Application

- **Web Interface**: http://localhost:8080/
- **H2 Console**: http://localhost:8080/h2-console
    - JDBC URL: `jdbc:h2:mem:<random-id>` (check console logs for exact URL)
    - Username: `SA`
    - Password: (leave empty)

## Project Structure

```
src/main/java/com/hendisantika/booklist/
├── BookListApplication.java      # Main application class
├── domain/
│   ├── Book.java                 # JPA Entity
│   └── BookRepository.java       # JPA Repository
└── web/
    └── BookController.java       # Web Controller

src/main/resources/
├── application.properties         # Application configuration
├── templates/
│   └── booklist.html             # Thymeleaf template
└── static/
    └── css/
        └── bootstrap.min.css     # Bootstrap CSS
```

## Configuration

The application uses the following configuration in `application.properties`:

- `spring.jpa.show-sql=true` - Shows SQL queries in console
- `spring.jpa.hibernate.ddl-auto=update` - Auto-creates/updates database schema
- `spring.h2.console.enabled=true` - Enables H2 console

## Sample Data

The application automatically loads sample books on startup:

1. Kotlin in Action by Hendi Santika (2017)
2. Spring Boot in Action by Hendi Santika (2015)
3. Java Fundamental by Endy Muhardin (2016)