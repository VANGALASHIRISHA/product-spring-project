# Product Management System - Spring Boot REST API

## Overview

The Product Management System is a backend REST API application built using **Spring Boot**, **Spring Data JPA**, **Maven**, and **Oracle Database**. The application allows users to manage product information through RESTful APIs.

The system supports **CRUD operations (Create, Read, Update, Delete)** for product data. Users can add new products, retrieve product details, update existing products, and delete products from the database.

The project follows a **layered architecture** consisting of Controller, Service, Repository, and Model layers. This structure improves maintainability and separates responsibilities across the application.

Spring Boot simplifies application configuration and development, while **Spring Data JPA** provides an easy way to interact with the database using repositories. **Hibernate** is used as the JPA implementation to map Java objects to Oracle database tables.

This project is designed to demonstrate backend development concepts such as REST API design, database integration, dependency management using Maven, and object-relational mapping.

---

## Features

- Create new product
- View all products
- Get product by ID
- Update product details
- Delete product
- REST API implementation
- Oracle Database integration
- Maven dependency management

---

## Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Maven
- Oracle Database
- REST API
- Postman (for API testing)

---

## Project Architecture

Client (Postman / Browser)
        |
        v
ProductController
        |
        v
ProductService
        |
        v
ProductRepository
        |
        v
Oracle Database

---

## Project Structure

src/main/java/com/example/product20

controller  
→ Contains REST API endpoints

service  
→ Contains business logic

repository  
→ Handles database operations

model  
→ Contains Product entity class

src/main/resources

application.properties  
→ Application configuration

---

## Product Entity

The Product entity contains the following fields:

| Field | Description |
|------|-------------|
| id | Primary Key |
| name | Product name |
| price | Product price |
| quantity | Product quantity |
| category | Product category |


---

## API Endpoints

### Add Product

POST /product/addProduct

### Get All Products

GET /product/Products

### Get Product By ID

GET /product/{id}

Example

GET /product/1

### Update Product

PUT /product/{id}

### Delete Product

DELETE /product/{id}

---

## Service Layer

The `ProductService` class contains the business logic and interacts with the repository layer.

Example methods:

- createProduct()
- getAllProducts()
- getPsById()
- updatePv()
- deleteMv()

---

## Repository Layer

The repository uses Spring Data JPA.
@Repository
public interface ProductRepository extends JpaRepository<Product20, Integer> {

}

JpaRepository provides built-in methods like:

- save()
- findAll()
- findById()
- deleteById()

---

## Database Configuration

application.properties
spring.application.name=product20

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=system
spring.datasource.password=hello
spring.datasource.driver=oracle.jdbc.driver.OracleDriver

spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
---

## Database Table


CREATE TABLE Products20(
id NUMBER PRIMARY KEY,
name VARCHAR2(100),
price NUMBER,
quantity NUMBER,
category VARCHAR2(100)
);


---

## How to Run the Project

1. Install Java 17
2. Install Maven
3. Install Oracle Database
4. Import the project into **Eclipse or IntelliJ**
5. Configure database in **application.properties**
6. Run the **Spring Boot application**
7. Test APIs using **Postman**

---
