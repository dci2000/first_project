# first_project


## Spring boot project that implements swagger, jpa repository

## Technologies

```
java: 19
Spring boot: 3.0.3
Maven
Swagger/openapi: 2.0.2
Junit jupiter: 5.9.2
packaging: jar
```
## Requirements 
	- two entities in postgreSQL jpa repository	[x]				
	- Player and game [x]											
	- those entitites many to many relationship in database [x]		
	- API calls to make a player and game and to display them [x]	
	- swagger for client which implements the interface [x]
	- adding rest of CRUD functionalities [x]
	- use best practice of api endpoints [x]
	- adding the authentication []
	- fix the authentication package []

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


### Additional notes
	-Structure into API layer, Service Layer, Data Access Layer + database

#### API layer
	-controller of the player/game class 


#### Service layer
	-responsible for bussiness logic

#### Data access layer
	-repository



### Swagger UI
	-URL address: /swagger-ui.html
