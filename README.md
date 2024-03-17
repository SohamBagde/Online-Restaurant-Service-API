# Online-Restaurant-Service-API
# Restaurant Service API

This project is a simple REST API for a hypothetical online restaurant service. It provides endpoints to manage products and orders.

## Features

- CRUD operations for managing products (Create, Read, Update, Delete)
- Place orders for products
- List all orders

## Technologies Used

- Java
- Spring Boot
- Hibernate
- MySQL
- Maven (Dependency Management)

## API Endpoints
- Product Endpoints
Retrieve all products:

- GET /api/products
Retrieve product by ID:

- GET /api/products/{id}
Create a new product:

- POST /api/products
Update an existing product:

- PUT /api/products/{id}
Delete a product:

- DELETE /api/products/{id}
Order Endpoints
Retrieve all orders:

- GET /api/orders
Retrieve order by ID:

- GET /api/orders/{id}
Place a new order:

- POST /api/orders
Delete an order:

- DELETE /api/orders/{id}
