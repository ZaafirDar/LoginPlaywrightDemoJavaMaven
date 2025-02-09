# My Java Project

This is a simple Java project that demonstrates the structure of a Maven-based application.

## Project Structure

```
my-java-project
├── src
│   ├── main
│   │   └── java
│   │       └── App.java
│   └── test
│       └── java
│           └── AppTest.java
├── pom.xml
└── README.md
```

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
java -cp target/my-java-project-1.0-SNAPSHOT.jar App
```

## Running Tests

To run the tests, use the following command:

```
mvn compile exec:java -D exec.mainClass="org.example.App"
```

## License

This project is licensed under the MIT License.