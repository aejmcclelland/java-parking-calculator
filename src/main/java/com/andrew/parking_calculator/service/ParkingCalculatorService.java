package com.andrew.parking_calculator.service;

import java.util.List;

import com.andrew.parking_calculator.strategy.ParkingChargeStrategy;
import org.springframework.stereotype.Service;

@Service
public class ParkingCalculatorService {
    
    private final List<ParkingChargeStrategy> strategies;

    public ParkingCalculatorService(List<ParkingChargeStrategy> strategies) {
        this.strategies = strategies;
    }

    public double calculateCharge(int hours, String tariffType) {
        for (ParkingChargeStrategy strategy : strategies) {
            if (strategy.getTariffType().equalsIgnoreCase(tariffType)) {
                return strategy.calculate(hours);
            }
        }
        throw new IllegalArgumentException("Invalid tariff type: " + tariffType);
    }
}
