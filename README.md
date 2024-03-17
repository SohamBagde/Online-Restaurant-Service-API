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
## Product Endpoints

| Method | URL                  | Description                      |
|--------|----------------------|----------------------------------|
| GET    | /api/products        | Retrieve all products.           |
| POST   | /api/products        | Create a new product.            |
| GET    | /api/products/{id}   | Retrieve product by ID.          |
| PATCH  | /api/products/{id}   | Update data in product by ID.    |
| DELETE | /api/products/{id}   | Delete a product by ID.          |

## Order Endpoints

| Method | URL                  | Description                                     |
|--------|----------------------|-------------------------------------------------|
| GET    | /api/orders          | Retrieve all orders.                            |
| POST   | /api/orders          | Place a new order.                              |
| GET    | /api/orders/{id}     | Retrieve order by ID.                           |
| DELETE | /api/orders/{id}     | Delete an order by ID.                          |


