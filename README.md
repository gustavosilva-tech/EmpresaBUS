# Bus Travel Company

A console application developed in Java for managing a bus travel company.

The project enables the management of drivers, passengers, and trips, including ticket sales, driver assignment, and the calculation of available seats and revenue.

## About the project

This project was developed as part of the **Algorithms and Data Structures** course, aiming to apply concepts such as object-oriented programming, inheritance, class associations, and the use of the Java Collections Framework.

The application models a bus travel company that manages:

- Drivers.
- Passengers.
- Completed and scheduled trips.
- Ticket sales.
- Available seats.
- Revenue generated per trip.

## Features

The application implements the following features:

- Add drivers to the company.
- Record each driver's monthly salary.
- Remove drivers using their identifier.
- Add trips.
- Assign a driver to a trip.
- Register passengers.
- Store passenger names and phone numbers.
- Sell tickets for a specific trip.
- Check for available seats.
- Calculate the number of tickets sold.
- Calculate the number of free seats.
- Calculate revenue for a specific trip.
- Calculate the company's total revenue.
- Remove trips using their specific code.

## Class model

The system consists of the following main classes:

### Person

A base class representing a person in the system.

Each person is characterized by:

- Tax identification number.
- Name.

### Driver

A class derived from `Person` that represents a company driver.

In addition to inherited data, it includes:

- Monthly salary.

A driver can be associated with multiple trips. ### Passenger

A class derived from `Pessoa` (Person) that represents a passenger.

Each passenger has:

- A phone number.

A passenger can purchase tickets for different trips.

### Trip

Represents a bus journey.

Each trip has:

- An identification code.
- Departure location.
- Destination location.
- Departure date and time.
- Ticket price.
- Total number of seats.
- Assigned driver.
- List of passengers.

The class allows for calculating available seats and trip revenue.

### Company

Represents the travel company.

It is responsible for managing:

- The collection of drivers.
- The collection of trips.
- The addition and removal of entities.
- Ticket sales.
- The calculation of total revenue.

## Technologies used

- Java.
- Java Development Kit 7 or higher.
- Java Collections Framework.
- NetBeans IDE.
- Console application.
- Javadoc for code documentation.

## Collections used

Collections from the **Java Collections Framework** are used to store and manage entities, including various collection types such as:

- `ArrayList` to store passengers associated with trips.
- `HashMap` or `ArrayList` to manage drivers and trips.

## How to run

The following must be installed:

- JDK 7 or higher.
- NetBeans IDE or another Java development environment.

### Running via NetBeans

1. Open the project in NetBeans.
2. Confirm that the main class is located in the `principal` package.
3. Run the `Main.java` file.
4. Check the results displayed in the console. ### Run via terminal

In the project's root directory, compile the Java files:

```bash
javac -d out src/trab1/*.java src/principal/*.java
```

Then, run the application:

```bash
java -cp out principal.Main
```

> Depending on the project structure or Java version, the commands may need to be adjusted.

GUSTAVO SILVA.


