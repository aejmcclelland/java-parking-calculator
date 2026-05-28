package com.andrew.parking_calculator.strategy;

import org.springframework.stereotype.Component;

@Component
public class FlatRateStrategy implements ParkingChargeStrategy {

    @Override
    public double calculate(int hours) {
        return 6.00; // Flat rate for any duration
    }

    @Override
    public String getTariffType() {
        return "flat";
    }
}
