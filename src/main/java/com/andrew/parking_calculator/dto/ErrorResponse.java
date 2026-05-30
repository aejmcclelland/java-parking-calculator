package com.andrew.parking_calculator.dto;

public record ErrorResponse(

        int status,

        String error,

        String message) {

}