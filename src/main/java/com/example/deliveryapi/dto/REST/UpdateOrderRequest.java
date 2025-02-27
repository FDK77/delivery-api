package com.example.deliveryapi.dto.REST;



import com.example.deliveryapi.enums.Status;

import java.time.LocalDateTime;
import java.util.UUID;

public class UpdateOrderRequest {
    private LocalDateTime orderDate;
    private String customerName;
    private String customerAddress;
    private Status status;
    private UUID delivererId;
    private double orderCost;
    private String deliveryInstructions;
    private LocalDateTime deliveryDate;
    private double customerLatitude;
    private double customerLongitude;
    private double delivererLatitude;
    private double delivererLongitude;

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public UUID getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(UUID delivererId) {
        this.delivererId = delivererId;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getCustomerLatitude() {
        return customerLatitude;
    }

    public void setCustomerLatitude(double customerLatitude) {
        this.customerLatitude = customerLatitude;
    }

    public double getCustomerLongitude() {
        return customerLongitude;
    }

    public void setCustomerLongitude(double customerLongitude) {
        this.customerLongitude = customerLongitude;
    }

    public double getDelivererLatitude() {
        return delivererLatitude;
    }

    public void setDelivererLatitude(double delivererLatitude) {
        this.delivererLatitude = delivererLatitude;
    }

    public double getDelivererLongitude() {
        return delivererLongitude;
    }

    public void setDelivererLongitude(double delivererLongitude) {
        this.delivererLongitude = delivererLongitude;
    }
}
