# Project Name
Faculty of Science Library Management System
## Overview

Provide a brief description of our project.

## Prerequisites

Before running this project, ensure you have the following installed:

1. **Java JDK**: Version 17 or 19. Download and install from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or use [OpenJDK](https://adoptopenjdk.net/).
2. **Maven**: Download and install Maven from [Apache Maven Project](https://maven.apache.org/download.cgi). Follow the installation instructions provided on the site.
3. **Environment Variables**: Set the JAVA_HOME and MAVEN_HOME environment variables. Add the bin directories of both JDK and Maven to the PATH variable. This allows running Java and Maven commands from the command line.
4. **Integrated Development Environment (IDE)**: (Optional) An IDE like IntelliJ IDEA, Eclipse, or Spring Tool Suite (STS) can be helpful for running and editing the project.

## Setup and Running

### Open the Project from the zip file

1. Clone the repository using Git:

### Running the Application

1. Navigate to the project directory:
   ```
   cd [project-name]
   ```

2. install all dependencies:
   ```
   mvn clean install
   ```
3. Run the Spring Boot application using Maven:
   ```
   mvn spring-boot:run
   ```

   This command will start the Spring Boot application. The application will be accessible on `http://localhost:8080` (or another port if configured differently in the `application.properties` file).

### Accessing the REST APIs

- The REST APIs can be accessed via the aforementioned URL using tools like Postman or directly through a web browser, depending on the API's nature (GET, POST, etc.).
- or you can use swagger to access the APIs. The swagger UI can be accessed via `http://localhost:8080/swagger-ui/index.html#/`.

## Additional Information

- This project does not require any specific database configuration for initial setup and run because we already running our DB on a cloud server.
