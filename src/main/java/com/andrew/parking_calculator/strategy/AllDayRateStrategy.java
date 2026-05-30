package com.andrew.parking_calculator.strategy;

import org.springframework.stereotype.Component;

@Component
public class AllDayRateStrategy implements ParkingChargeStrategy {

    @Override
    public double calculate(int hours) {
        if (hours <= 24) {
            return 12.00; // Flat rate for up to 24 hours
        } else {
            return 12.00 + ((hours - 24) * 0.50); // Additional charge for each hour beyond 24
        }
    }

    @Override
    public String getTariffType() {
        return "all-day";
    }
    
}
