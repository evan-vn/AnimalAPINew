*This is a a data persistent CRUD  API for Animal objects using SpringBoot (with JPA) and MySQL.
*You can:
  **Get all animals.
      ***Using GET method
      ***Example: http://localhost:8080/animals/all
  **Get an animal by its ID.
      ***Using GET method
      ***Example: http://localhost:8080/animals/1
  **Get all animals of a given species.
      ***Using GET method
      ***Example: http://localhost:8080/animals/search/Mammal
  **Get animals whose name contains a string, (for example the search key "blue" could return [Blue Jay, Great Blue Heron, Russian Blue Cat, Blue Poison Dart Frog] etc.)
      ***Using GET method
      ***Example: http://localhost:8080/animals/search?name=blue
  **Add a new animal.
      ***Using POST method
      ***Example: http://localhost:8080/animals/new
  **Update an existing animal.
      ***Using PUT method
      ***Example: http://localhost:8080/animals/update/1
  **Delete an existing animal.
      ***Using DELETE method
      ***Example: http://localhost:8080/animals/delete/1
