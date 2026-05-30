package com.andrew.parking_calculator;
import com.andrew.parking_calculator.strategy.ParkingChargeStrategy;

public class ParkingCalculator {
    
    private final ParkingChargeStrategy strategy;

    public ParkingCalculator(ParkingChargeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(int hours) {
        return strategy.calculate(hours);
    }
}
