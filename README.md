# Microservices Repository

This repository contains a basic setup for microservices architecture with four main components: `apigateway`, `com.eserver`, `contactService`, and `userService`. The project utilizes Spring Boot to implement two API services.

## Project Structure

- **apigateway**: This folder houses the API Gateway service responsible for routing and managing requests.

- **com.eserver**: The common server component contains shared functionality or utilities that can be used across multiple services.

- **contactService**: The Contact Service is a microservice that handles operations related to contacts. It runs on port 9002.

- **userService**: The User Service is a microservice that manages user-related operations. It runs on port 9001.

- **.gitignore**: This file specifies intentionally untracked files that Git should ignore.

- **README.md**: This documentation file.

## Services and Ports

### Contact Service

- **Port:** 9002
- **Functionality:** Manages operations related to contacts.

### User Service

- **Port:** 9001
- **Functionality:** Handles user-related operations.

## Author

- **Anurag Choudhary**

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/microservices-repo.git
    ```

2. Navigate to the specific service you want to run, e.g., contactService or userService.


3. Build and run the service using Spring Boot. For example, using Maven:

    ```bash
    cd contactService
    mvn spring-boot:run
   ```

    Repeat the process for other services.



4. Access the services via the specified ports. For example:

   > Contact Service: `http://localhost:9002` <br/>
   > User Service: `http://localhost:9001`

## Note
Make sure to customize the configuration and functionality based on your specific requirements. This repository serves as a basic template for a microservices project using Spring Boot.

Feel free to reach out to the author, [Anurag Choudhary](https://github.com/anuragjatofficial), for any inquiries or feedback.
