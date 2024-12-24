package com.example.deliveryapi.exceptions;

public class DelivererNotFoundException extends RuntimeException {
    public DelivererNotFoundException(String message) {
        super(message);
    }
}