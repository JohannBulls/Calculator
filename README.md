# Spring Boot Calculator

This project is a simple calculator application built with Spring Boot. It allows performing basic operations such as addition, subtraction, multiplication, and division through a web interface.

### Classes and Description

1. **Calculadora**:
    - Class representing a basic calculator.
    - Allows performing addition, subtraction, multiplication, and division operations, as well as resetting the result.

2. **CalculadoraApplication**:
    - Main class that starts the Spring Boot application.

3. **CalculadoraController**:
    - Controller that handles HTTP requests for the calculator.
    - Provides methods for performing calculations and resetting the calculator.

4. **GlobalExceptionHandler**:
    - Global exception handler to capture and handle specific exceptions thrown by any controller.

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

To build and run this project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Git

### Installation

Follow these steps to set up your development environment:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/JohannBulls/Calculator.git
   ```

2. Navigate into the project directory:

   ```bash
   cd Calculator
   ```

3. Compile the project using Maven:

   ```bash
   mvn clean compile
   ```

### Running the Application

To run the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`.


## Deployment

To deploy this application on a live system:

1. **Ensure all dependencies are installed:**

   - Java Runtime Environment (JRE) 8 or higher

2. **Compile the project:**

   ```bash
   mvn clean package
   ```

3. **Run the application:**

   ```bash
   java -jar target/SpringBootCalculator.jar
   ```

## Built With

- [Java](https://www.java.com/) - Programming language
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building web applications
- [Thymeleaf](https://www.thymeleaf.org/) - Template engine
- [Bootstrap](https://getbootstrap.com/) - CSS framework
- [Apache Maven](https://maven.apache.org/) - Dependency management

## Versioning

We use [Git](https://git-scm.com/) for version control.

## Authors

- Johann Amaya Lopez - *JohannBulls* - [JohannBulls GitHub](https://github.com/JohannBulls)
## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.txt) file for details.
