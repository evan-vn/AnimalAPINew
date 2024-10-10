# Animal API

This is a data persistent CRUD API for Animal objects using Spring Boot (with JPA) and MySQL.

## Features
You can:
- **Get all animals**
  - **Method**: GET
  - **Endpoint**: `/animals/all`
  - **Example**: `http://localhost:8080/animals/all`

- **Get an animal by its ID**
  - **Method**: GET
  - **Endpoint**: `/animals/{id}`
  - **Example**: `http://localhost:8080/animals/1`

- **Get all animals of a given species**
  - **Method**: GET
  - **Endpoint**: `/animals/search/{species}`
  - **Example**: `http://localhost:8080/animals/search/Mammal`

- **Get animals whose name contains a string**
  - **Method**: GET
  - **Endpoint**: `/animals/search`
  - **Query Parameter**: `name`
  - **Example**: `http://localhost:8080/animals/search?name=blue`
  - **Description**: This could return animals like [Blue Jay, Great Blue Heron, Russian Blue Cat, Blue Poison Dart Frog], etc.

- **Add a new animal**
  - **Method**: POST
  - **Endpoint**: `/animals/new`
  - **Example**: `http://localhost:8080/animals/new`

- **Update an existing animal**
  - **Method**: PUT
  - **Endpoint**: `/animals/update/{id}`
  - **Example**: `http://localhost:8080/animals/update/1`

- **Delete an existing animal**
  - **Method**: DELETE
  - **Endpoint**: `/animals/delete/{id}`
  - **Example**: `http://localhost:8080/animals/delete/1`

## Getting Started

### Prerequisites

- Java 11 or higher
- Spring Web
- MySQL Driver
- Spring Data JPA

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/evan-vn/AnimalAPINew.git
   cd AnimalAPINew
