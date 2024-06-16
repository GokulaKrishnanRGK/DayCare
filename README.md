# School Management System

## Overview
Developed and implemented a comprehensive school management system, encompassing sophisticated architecture for seamless teacher, student, and classroom management, and implemented a secure two-factor authentication system based on mail OTP.

## Tech Stack
- Java
- Java Swing GUI
- Spring Boot
- Spring MVC
- Spring Data JPA
- SMTP
- MySQL

## Features
- Comprehensive management of teachers, students, and classrooms.
- Secure two-factor authentication using mail OTP.
- Optimized software solution using advanced object-oriented principles and high-level design patterns.

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/school-management-system.git
    ```
2. Navigate to the project directory:
    ```bash
    cd school-management-system
    ```
3. Install dependencies and build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Set up the MySQL database and update the `application.properties` file with your database configuration:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/school_management
    spring.datasource.username=yourUsername
    spring.datasource.password=yourPassword
    spring.jpa.hibernate.ddl-auto=update
    ```
5. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage
1. Open the application.
2. Use the GUI to manage teachers, students, and classrooms.
3. Follow the prompts to authenticate using mail OTP for secure access.
