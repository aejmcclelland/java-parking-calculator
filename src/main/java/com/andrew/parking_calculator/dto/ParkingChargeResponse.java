package com.andrew.parking_calculator.dto;

public class ParkingChargeResponse {

    private int hours;
    private String tariffType;
    private double totalCharge;

    public ParkingChargeResponse(int hours, String tariffType, double totalCharge) {
        this.hours = hours;
        this.tariffType = tariffType;
        this.totalCharge = totalCharge;
    }

    public int getHours() {
        return hours;
    }
    public String getTariffType() {
        return tariffType;
    }
    public double getTotalCharge() {
        return totalCharge;
    }
}
    
