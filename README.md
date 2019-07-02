This is Spring Boot based retail application. The port number is 8080.

The APIs are documented using Swagger 2.
The Swagger UI : http://localhost:8080/swagger-ui.html

APIs:

User Details
POST "/register" - to purform the register opertation of new user or customer.
GET "/users/{userId}" - get the user detail of corresponding user id.

Purchase Product and Billing
POST "/purchase/{userId}" - helps to add the products purchased by the user to our application which will be used future in billing.
GET "/bill{userId}" - will calculate the bill of the given user.

DAO operation is skipped in this codebase. Just focused on Controller and Service layers.

I consider Mockito Framework to implement the Test cases and coverages.

