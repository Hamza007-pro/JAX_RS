JAX-RS Bank Account Management API
A RESTful API for managing bank accounts (Compte) using Spring Boot and JAX-RS with XML and JSON support. The project demonstrates CRUD operations for managing bank accounts with XML and JSON data formats.

Table of Contents
Features
Technologies Used
Getting Started
Prerequisites
Installation
Database Setup
Endpoints
Get All Accounts
Get Account by ID
Create Account
Update Account
Delete Account
Usage
Contributing
License
Features
CRUD operations for managing bank accounts (Compte entity).
Supports JSON and XML response formats.
Error handling for invalid requests.
Technologies Used
Java: Programming language
Spring Boot: Application framework
JAX-RS: Java API for RESTful Web Services
Hibernate/JPA: ORM for database interactions
MySQL: Database
Maven: Build and dependency management
Getting Started
Prerequisites
Java 17 or higher
Maven installed
MySQL server running
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/jaxrs-bank-api.git
cd jaxrs-bank-api
Configure the Database: Update the application.properties file with your MySQL database information:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
Build the Project:

bash
Copy code
mvn clean install
Run the Application:

bash
Copy code
mvn spring-boot:run
The API should now be running on http://localhost:8080.

Database Setup
Create a MySQL database:
sql
Copy code
CREATE DATABASE your_database_name;
Ensure the database name and credentials match those configured in the application.properties file.
Endpoints
Get All Accounts
URL: /banque/compts
Method: GET
Response Format: application/json or application/xml
Get Account by ID
URL: /banque/compt/{id}
Method: GET
Response Format: application/json or application/xml
Create Account
URL: /banque/addCompte
Method: POST
Content Type: application/json or application/xml
Example JSON Request Body
json
Copy code
{
  "solde": 1000.00,
  "dateCreation": "2024-01-01",
  "type": "COURANT"
}
Update Account
URL: /banque/updateCompte/{id}
Method: PUT
Content Type: application/json or application/xml
Example JSON Request Body
json
Copy code
{
  "solde": 1200.00,
  "dateCreation": "2024-01-01",
  "type": "EPARGNE"
}
Delete Account
URL: /banque/deleteCompte/{id}
Method: DELETE
Usage
To test this API, you can use tools like Insomnia or Postman. Make sure to set the Accept header to either application/json or application/xml to receive responses in your preferred format.

Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a feature branch (git checkout -b feature/AmazingFeature).
Commit your changes (git commit -m 'Add some AmazingFeature').
Push to the branch (git push origin feature/AmazingFeature).
Open a Pull Request.
License
Distributed under the MIT License. See LICENSE for more information.
