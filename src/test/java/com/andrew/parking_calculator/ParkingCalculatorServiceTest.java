package com.andrew.parking_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.andrew.parking_calculator.service.ParkingCalculatorService;
import com.andrew.parking_calculator.strategy.AllDayRateStrategy;
import com.andrew.parking_calculator.strategy.FlatRateStrategy;
import com.andrew.parking_calculator.strategy.HourlyRateStrategy;
import com.andrew.parking_calculator.strategy.ParkingChargeStrategy;

class ParkingCalculatorServiceTest {

    @Test
    void calculatesChargeUsingHourlyStrategy() {
        List<ParkingChargeStrategy> strategies = List.of(
                new HourlyRateStrategy(),
                new FlatRateStrategy(),
                new AllDayRateStrategy());

        ParkingCalculatorService service = new ParkingCalculatorService(strategies);
        
        double result = service.calculateCharge(3, "hourly");
        
        assertEquals(15.00, result);
    }

    @Test
    void calculatesChargeUsingAllDayStrategy() {
        List<ParkingChargeStrategy> strategies = List.of(
                new HourlyRateStrategy(),
                new FlatRateStrategy(),
                new AllDayRateStrategy());

        ParkingCalculatorService service = new ParkingCalculatorService(strategies);
        
        double result = service.calculateCharge(30, "all-day");
        
        assertEquals(15.00, result);
    }

    @Test
    void throwsExceptionForInvalidTariffType() {
        List<ParkingChargeStrategy> strategies = List.of(
                new HourlyRateStrategy(),
                new FlatRateStrategy(),
                new AllDayRateStrategy());
        
        ParkingCalculatorService service = new ParkingCalculatorService(strategies);
       
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.calculateCharge(3, "invalid"));

        assertEquals("Invalid tariff type: invalid", exception.getMessage());
    }
}
