package com.andrew.parking_calculator;
    import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.andrew.parking_calculator.strategy.FlatRateStrategy;
import com.andrew.parking_calculator.strategy.HourlyRateStrategy;

class ParkingCalculatorTest {

    @Test
    void calculatesChargeUsingHourlyStrategy() {
        ParkingCalculator calculator = new ParkingCalculator(new HourlyRateStrategy());

        double result = calculator.calculate(3);

        assertEquals(15.00, result);
    }

    @Test
    void calculatesChargeUsingFlatRateStrategy() {
        ParkingCalculator calculator = new ParkingCalculator(new FlatRateStrategy());

        double result = calculator.calculate(3);

        assertEquals(6.00, result);
    }
}
