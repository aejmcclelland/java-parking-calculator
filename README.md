# Parking Calculator

A small Java/Spring Boot API demonstrating object-oriented design through
interchangeable parking tariff strategies.

## What this project demonstrates

- Java interfaces
- Polymorphism
- Strategy-based design
- Spring Boot REST controller
- Service layer
- Basic request/response DTOs

## OOP concept

The project uses a `ParkingChargeStrategy` interface with multiple
implementations, such as hourly and flat-rate tariffs.

The `ParkingCalculatorService` works with the interface rather than a specific
concrete class. This allows different pricing strategies to be selected at
runtime without changing the controller or duplicating calculation logic.

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

