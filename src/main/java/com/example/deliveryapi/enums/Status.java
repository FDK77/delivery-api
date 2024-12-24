package com.example.deliveryapi.enums;

public enum Status {
    ASSEMBLING,    // В сборке
    IN_TRANSIT,    // В процессе доставки
    ARRIVED,       // Товар прибыл к получателю
    DELIVERED,     // Доставлен
    CANCELED       // Отменен
}
