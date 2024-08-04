# SpringBoot-UserAuth
# UserAuthApp

UserAuth is a simple user registration and email verification service built with Spring Boot. It demonstrates how to create a secure user registration system with email validation and token-based confirmation.

## Features

- User registration with email validation
- Secure password storage with BCrypt
- Email verification with unique tokens
- User activation upon email confirmation
- User login with Spring Security

## Technologies Used

- Java 20
- Spring Boot 3.3.2
- Spring Data JPA
- Hibernate
- PostgreSQL
- Lombok
- MailDev (for email testing)
- Spring Security
- Thymeleaf (or other templating engine for HTML views)

## Getting Started

### Prerequisites

- Java 20
- Maven
- Docker (for running MailDev)
- PostgreSQL

### Installation

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-username/UserAuthApp.git
    cd UserAuthApp
    ```

2. **Set up PostgreSQL**
    - Create a database named `user_auth_app`.
    - Update the `application.properties` file with your PostgreSQL username and password.

3. **Run MailDev (for testing email)**
    ```bash
    docker run -p 1080:1080 -p 1025:1025 maildev/maildev
    ```

4. **Build and run the application**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### Configuration

- `application.properties`
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/user_auth_app
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    spring.mail.host=localhost
    spring.mail.port=1025
    spring.mail.username=
    spring.mail.password=
    spring.mail.properties.mail.smtp.auth=false
    spring.mail.properties.mail.smtp.starttls.enable=false
    ```

## Usage

1. **Register a new user**
    - Send a POST request to `/api/v1/registration` with the following JSON body:
        ```json
        {
            "firstName": "John",
            "lastName": "Doe",
            "email": "john.doe@example.com",
            "password": "password"
        }
        ```

2. **Confirm the email**
    - Check the MailDev web interface at `http://localhost:1080` for the confirmation email.
    - Click the confirmation link in the email to activate the user account.

3. **Login**
    - Access the login page at `http://localhost:8080/login`.
    - Enter your email and password to log in.

## Project Structure

- `model`: Contains entity classes.
- `repository`: Contains JPA repository interfaces.
- `service`: Contains service classes for business logic.
- `controller`: Contains REST controllers for handling HTTP requests.
- `security`: Contains security-related classes.
- `email`: Contains email sending functionality.
- `token`: Contains token-related functionality.

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by various online tutorials and Spring Boot documentation.
