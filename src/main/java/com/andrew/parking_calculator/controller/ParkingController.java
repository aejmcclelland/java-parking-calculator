package com.andrew.parking_calculator.controller;

import com.andrew.parking_calculator.dto.ParkingChargeRequest;
import com.andrew.parking_calculator.dto.ParkingChargeResponse;
import com.andrew.parking_calculator.service.ParkingCalculatorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private final ParkingCalculatorService parkingCalculatorService;

    public ParkingController(ParkingCalculatorService parkingCalculatorService) {
        this.parkingCalculatorService = parkingCalculatorService;
    }

    @PostMapping("/calculate")
    public ParkingChargeResponse calculate(@Valid @RequestBody ParkingChargeRequest request) {
        double totalCharge = parkingCalculatorService.calculateCharge(
                request.getHours(),
                request.getTariffType()
        );

        return new ParkingChargeResponse(
                request.getHours(),
                request.getTariffType(),
                totalCharge
        );
    }
}
