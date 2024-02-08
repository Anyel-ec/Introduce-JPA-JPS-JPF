# CRUD With JPA and JSP of Java about Users

This project is a sample web application implementing a basic CRUD (Create, Read, Update, Delete) to manage users using JavaServer Faces (JSF), JPA (Java Persistence API) with Hibernate as the persistence provider, and MySQL as the database.

## **Select Language: 🌐** 
- [Español (Spanish)](README.md)
- [English](README-en.md)

## Prerequisites

To run this project, you'll need to have the following installed:

- Java Development Kit (JDK)
- Apache Maven
- A JSF-compatible application server, such as Apache Tomcat
- MySQL Server

## Database Configuration

This project uses MySQL as the database. Before running the application, make sure you have created a database named `jpa` and configured the access credentials in the `persistence.xml` file.

## Installation and Execution

1. Clone this repository or download the source code.
2. Import the project into your preferred development environment.
3. Ensure all Maven dependencies are downloaded correctly.
4. Configure your application server to run the application.
5. Run the project on the application server.

## Project Structure

The project is divided into the following packages:

- `com.espe.controller`: Contains the application controllers, which handle user interactions and business logic.
- `com.espe.dao`: Contains data access classes that interact with the database.
- `com.espe.idao`: Defines the data access interface for the `Usuario` entity.
- `com.espe.model`: Contains the `Usuario` entity and the utility class `JPAUtil` for persistence management.
- `webapp`: Contains the application views in XHTML files.

## Main Features

- **List Users**: Displays a table with existing users.
- **Edit User**: Allows editing information of an existing user.
- **Delete User**: Deletes a user from the database.
- **Add User**: Allows adding a new user to the database.

## Contribution

If you'd like to contribute to this project, feel free to fork it and send your pull requests!

## Author

Developed by [Anyel EC](https://github.com/anyel-ec).

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
