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
- Global exception handling with structured error responses
- JUnit unit testing
- Testing multiple strategy implementations

## OOP concept

The project uses a `ParkingChargeStrategy` interface with multiple
implementations, including hourly, flat-rate, and all-day tariffs.


The `ParkingCalculatorService` works with the interface rather than a specific
concrete class. This allows different pricing strategies to be selected at
runtime without changing the controller or duplicating calculation logic.

## Testing

This project includes unit tests for the parking tariff strategy classes and service-layer strategy selection.

Current test coverage includes:

- Hourly rate calculation
- Flat-rate calculation
- All-day flat charge up to 24 hours
- Additional all-day charge beyond 24 hours
- Strategy behaviour using JUnit assertions
- Service-layer strategy selection
- Invalid tariff error handling at service level

Current test status:

```bash
Tests run: 10, Failures: 0, Errors: 0
```

## Run the app

```bash
./mvnw spring-boot:run 

curl -X POST http://localhost:8080/api/parking/calculate \
  -H "Content-Type: application/json" \
  -d '{"hours": 3, "tariffType": "hourly"}'
```
After that, run:

```bash

./mvnw test

```

#### JSON

```json
{
  "hours": 3,
  "tariffType": "hourly",
  "totalCharge": 15.0
}
```

### Error response example

Invalid tariff types return a structured `400 Bad Request` response.

```bash
curl -i -X POST http://localhost:8080/api/parking/calculate \
  -H "Content-Type: application/json" \
  -d '{"hours": 3, "tariffType": "invalid"}'
```

```json
{
  "status": 400,
  "error": "Bad Request",
  "message": "Invalid tariff type: invalid"
}
```

### Why I built this

This is a small Java/Spring Boot practice project built to strengthen Java
fundamentals, OOP understanding, backend API structure, testing, and error
handling.
