package com.andrew.parking_calculator.strategy;

import org.springframework.stereotype.Component;

@Component
public class HourlyRateStrategy implements ParkingChargeStrategy {

    private static final double HOURLY_RATE = 5.00;

    @Override
    public double calculate(int hours) {
        return hours * HOURLY_RATE;
    }

    @Override
    public String getTariffType() {
        return "hourly";
    }
    
}
