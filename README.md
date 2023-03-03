# first_project


## Spring boot project that implements swagger, jpa repository

## Technologies

```
java: 17
Spring boot: 3.0.1
Maven
Swagger/openapi: 2.0.2
Junit jupiter: 5.9.2
packaging: jar
```
## Requirements 
	- two entities in postgreSQL jpa repository
	- Player and game
	- those entitites many to many relationship in database
	- swagger for client which implements the interface

### Player fields
	- id, name, lastname, phone, email

### Game fields
	- id, name, result, start, end


## Dependencies

### Swagger

```XML
<dependency>
	<groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
	<version>2.0.2</version>
</dependency>
```



