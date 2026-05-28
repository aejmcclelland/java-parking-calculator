package com.andrew.parking_calculator.strategy;

public interface ParkingChargeStrategy {
    double calculate(int hours);
    String getTariffType();
}
