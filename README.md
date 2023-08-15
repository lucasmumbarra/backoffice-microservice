# Backoffice Microservice - README

This is the repository for the Backoffice Microservice, a Java 11 application developed with Spring Framework 2.5.5, using MySQL as the database. This project is managed with Maven, Dockerized, and also integrated with Swagger for API documentation.

## Prerequisites

Before running the backoffice microservice, make sure you have the following prerequisites installed on your machine:

1. Java Development Kit (JDK) 11 or higher
2. Apache Maven
3. Docker
4. Visual Studio Code (VSCode) or any preferred IDE

## Installing MySQL via Docker

To run the MySQL database in a Docker container, follow the steps below:

1. Open a terminal or command prompt.

2. Execute the following command to download and run the MySQL image in Docker:

   ```bash
   docker run -d -p 3306:3306 --name my_mysql -e MYSQL_ROOT_PASSWORD=your_secret_password mysql:latest
   ```

   Replace "your_secret_password" with the password you want to assign to the MySQL root user.

3. Wait until the container is created and running.

## Configuration of the Microservice

Before running the backoffice microservice, you need to configure the MySQL database in the `application.properties` file located in the `src/main/resources/` directory. Adjust the following properties according to your environment:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Replace:
- `your_database_name` with the name of the database you want to use.
- `your_username` with the username of the database user.
- `your_password` with the password of the database user.

## Building and Running the Microservice

To build and run the backoffice microservice, follow the steps below:

1. Open the project in Visual Studio Code or your preferred IDE.

2. Make sure you have Apache Maven installed on your system.

3. Build the project using the following Maven command:

   ```bash
   mvn clean install
   ```

4. Once the build is successful, locate the launch configuration file for running the project. Make sure to configure it correctly with the appropriate parameters for your environment.

5. Execute the project using the "play" button or the appropriate option in the toolbar.

The backoffice microservice will be available at `http://localhost:8080` after the initialization.

## Accessing the API Documentation via Swagger

After running the microservice, you can access the API documentation through Swagger. Simply open your browser and go to the following URL:

```
http://localhost:8080/swagger-ui.html
```

You will be directed to the interactive Swagger interface, where you can explore and test the available API endpoints.

## Final Remarks

This is a basic guide to set up and run the Backoffice Microservice using Maven, Docker, MySQL, and Swagger. Be sure to update the README with relevant information about the project, such as its functionality, directory structure, among other specific details.

Remember to keep this document up to date as the project evolves or new changes occur in the development environment.

Happy coding! 🚀
