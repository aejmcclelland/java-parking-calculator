# Parking Calculator

![Tests](https://img.shields.io/badge/tests-10%20passing-brightgreen)

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green)

![JUnit](https://img.shields.io/badge/JUnit-5-blue)

A small Java/Spring Boot API demonstrating object-oriented design through
interchangeable parking tariff strategies.

## What this project demonstrates

- Java interfaces
- Polymorphism
- Strategy-based design
- Spring Boot REST controller
- Service layer
- Basic request/response DTOs
- JUnit unit testing
- Testing multiple strategy implementations

## OOP concept

The project uses a `ParkingChargeStrategy` interface with multiple
implementations, including hourly, flat-rate, and all-day tariffs.


The `ParkingCalculatorService` works with the interface rather than a specific
concrete class. This allows different pricing strategies to be selected at
runtime without changing the controller or duplicating calculation logic.

## Testing

This project includes unit tests for the parking tariff strategy classes.

Current test coverage includes:

- Hourly rate calculation
- Flat-rate calculation
- All-day flat charge up to 24 hours
- Additional all-day charge beyond 24 hours
- Strategy behaviour using JUnit assertions

Current test status:

```bash
Tests run: 7, Failures: 0, Errors: 0
```

## Run the app

```bash
./mvnw spring-boot:run
```

```bash
curl -X POST http://localhost:8080/api/parking/calculate \

  -H "Content-Type: application/json" \

  -d '{"hours": 3, "tariffType": "hourly"}'
```

#### JSON

```bash
{
  "hours": 3,
  "tariffType": "hourly",
  "totalCharge": 7.5
}
```

### Why I built this

This is a small Java/Spring Boot practice project built to strengthen Java
fundamentals, OOP understanding, and backend API structure.

