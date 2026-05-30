package com.andrew.parking_calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.andrew.parking_calculator.strategy.AllDayRateStrategy;

class AllDayRateStrategyTest {
    
    @Test
    void returnsFlatAllDayChargeForUpTo24Hours() {
        AllDayRateStrategy strategy = new AllDayRateStrategy();

        double result = strategy.calculate(24);
        assertEquals(12.00, result);
    }  
    
    @Test
    void calculatesAdditionalChargeForHoursBeyond24() {
        AllDayRateStrategy strategy = new AllDayRateStrategy();

        double result = strategy.calculate(26);
        assertEquals(13.00, result); // 12.00 for first 24 hours + 0.50 for each additional hour (2 hours * 0.50 = 1.00)
    }
}
