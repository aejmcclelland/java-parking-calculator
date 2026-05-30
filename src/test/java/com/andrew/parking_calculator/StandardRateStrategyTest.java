package com.andrew.parking_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.andrew.parking_calculator.strategy.FlatRateStrategy;
import com.andrew.parking_calculator.strategy.HourlyRateStrategy;

class StandardRateStrategyTest {
    
    @Test
void calculatesHourlyCharge() {
    HourlyRateStrategy strategy = new HourlyRateStrategy();

    double result = strategy.calculate(3);

    assertEquals(15.00, result);
}

@Test
void returnsFlatChargeRegardlessOfHours() {
    FlatRateStrategy strategy = new FlatRateStrategy();

    double result = strategy.calculate(3);

    assertEquals(6.00, result);
}

}
