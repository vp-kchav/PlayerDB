## Player service

Player service is a spring boot based microservice which serves the contents of `Player.csv` through a REST API.

APIs implemented:

- `GET /v1/players` - returns the list of all players.
- `GET /v1/players/{playerID}` - returns a single player by ID.
- `GET /v1/players/country/{countryName}` - returns the list of all players by *countryName*

Player service makes CRUD operations & finder methods with Spring Data JPA’s JpaRepository.

The database connected to this service is `in-memory H2 Database`.

### Technology

- Java 11
  - `brew install homebrew/cask-versions/corretto11`
  - https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html
- Maven 3.8.x
  - `brew install maven`
  - https://maven.apache.org/download.cgi
- Spring Boot 2.6.6 (with Spring Web MVC, Spring Data JPA)
- H2 Database

### Overview

- `Player` data model class corresponds to entity and table `PLAYERS`.
- `PlayerRepository` is an interface that extends JpaRepository for CRUD methods and custom finder methods. It will be autowired in `PlayerServiceImpl` class.
- `PlayerController` is a RestController which has request mapping methods for RESTful requests - *getPlayers, getPlayerById and getPlayerByBirthCountry*
- Configuration for Spring Datasource, JPA & Hibernate in `application.yml`.
- `pom.xml` contains dependencies for Spring Boot and H2 Database.
- `/collection` folder contains sample requests for player service.
- [Sample Feature story](Sample_FEAT.md) contains information about a sample feature story which you can expect during the day of the interview.

### Remote Debugging
In case you need to remote debug, and need to start the app from the command line:
```
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
```
