Spring Boot Basic CRUD operations with Organisation and Employee One to Many Mapping.

DataBase used:
In-memory database H2.
Open database on the path http://localhost:8080/h2-ui/
Empty database with foreign key will be created

To build the project in STS:
Download and Extract the code.
Import the code as Maven project
Build as spring boot application by Rt. Click-> Run As-> Spring boot app.

To Test the application, hit on below URLs
http://localhost:8080/employee/all
http://localhost:8080/employee/all/{id}
http://localhost:8080/employee/add
http://localhost:8080/employee/delete/{id}
http://localhost:8080/employee/delete
http://localhost:8080/employee/update/{id}
http://localhost:8080/organisation/all
http://localhost:8080/organisation/all/{id}
http://localhost:8080/organisation/add
http://localhost:8080/organisation/delete/{id}
http://localhost:8080/organisation/delete
http://localhost:8080/organisation/update/{id}