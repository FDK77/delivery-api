package com.example.deliveryapi.dto.GraphQL;


import com.example.deliveryapi.enums.Status;

public record InputOrder(String orderDate,
                         String customerName, String customerAddress,
                         Float orderCost, String deliveryInstructions,
                         String deliveryDate, Status status,
                         String delivererId, Float customerLatitude,
                         Float customerLongitude, Float delivererLatitude,
                         Float delivererLongitude) {}
