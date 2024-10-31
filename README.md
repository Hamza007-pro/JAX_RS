Overview
This API manages CRUD operations for Compte entities (bank accounts), providing:

Data in JSON or XML formats based on client request.
Error handling for invalid IDs and missing resources.
Technologies
Java 17: Programming language
Spring Boot: Framework for building REST APIs
JAX-RS: API for RESTful Web Services
Hibernate/JPA: ORM for database interactions
MySQL: Database
Maven: Build tool and dependency manager
Setup
Prerequisites
Java 17+
Maven
MySQL Server
Installation
Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/jaxrs-bank-api.git
cd jaxrs-bank-api
Configure Database: Open application.properties and update with your MySQL settings:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
Build and Run the Application:

bash
Copy code
mvn clean install
mvn spring-boot:run
The API will be available at http://localhost:8080.

Database Configuration
Create a MySQL database:
sql
Copy code
CREATE DATABASE your_database_name;
Ensure the name and credentials match those in application.properties.
Endpoints
Endpoint	Method	Description	Content-Type
/banque/compts	GET	Fetch all accounts	JSON, XML
/banque/compt/{id}	GET	Fetch account by ID	JSON, XML
/banque/addCompte	POST	Create a new account	JSON, XML
/banque/updateCompte/{id}	PUT	Update an existing account	JSON, XML
/banque/deleteCompte/{id}	DELETE	Delete an account	JSON, XML
Example JSON for Creating an Account
json
Copy code
{
  "solde": 1000.00,
  "dateCreation": "2024-01-01",
  "type": "COURANT"
}
Testing and Usage
Use Postman or Insomnia for API requests. To specify response format, set the Accept header to application/json or application/xml.

Contribution
Fork the repo.
Create a feature branch:
bash
Copy code
git checkout -b feature/NewFeature
Commit your changes:
bash
Copy code
git commit -m 'Add new feature'
Push to your branch and open a Pull Request.
License
This project is distributed under the MIT License. See LICENSE for details.
