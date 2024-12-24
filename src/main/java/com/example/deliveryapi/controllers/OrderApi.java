package com.example.deliveryapi.controllers;

import com.example.deliveryapi.dto.REST.CreateOrderRequest;
import com.example.deliveryapi.dto.REST.OrderResponse;
import com.example.deliveryapi.dto.REST.UpdateOrderRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Tag(name = "Orders", description = "API для работы с заказами")
@ApiResponses({
        @ApiResponse(responseCode = "200", description = "Успешная обработка запроса"),
        @ApiResponse(responseCode = "400", description = "Ошибка валидации"),
        @ApiResponse(responseCode = "404", description = "Ресурс не найден"),
        @ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера")
})
@RequestMapping("/api/orders")
public interface OrderApi {

    @Operation(summary = "Получить все заказы")
    @GetMapping
    List<OrderResponse> getAllOrders();

    @Operation(summary = "Получить заказ по ID", responses = {
            @ApiResponse(responseCode = "200", description = "Заказ найден"),
            @ApiResponse(responseCode = "404", description = "Заказ не найден")
    })
    @GetMapping("/{id}")
    ResponseEntity<EntityModel<OrderResponse>> getOrder(@PathVariable UUID id);

    @Operation(summary = "Создать новый заказ")
    @PostMapping
    ResponseEntity<EntityModel<OrderResponse>> createOrder(@RequestBody CreateOrderRequest orderRequest);

    @Operation(summary = "Обновить информацию о заказе", responses = {
            @ApiResponse(responseCode = "200", description = "Информация о заказе обновлена"),
            @ApiResponse(responseCode = "404", description = "Заказ не найден")
    })
    @PutMapping("/{id}")
    ResponseEntity<EntityModel<OrderResponse>> updateOrder(@PathVariable UUID id, @RequestBody UpdateOrderRequest order);

    @Operation(summary = "Изменить статус заказа", responses = {
            @ApiResponse(responseCode = "200", description = "Статус заказа изменён"),
            @ApiResponse(responseCode = "404", description = "Заказ не найден")
    })
    @PutMapping("/status/{id}/{status}")
    ResponseEntity<EntityModel<OrderResponse>> changeStatus(@PathVariable UUID id, @PathVariable String status);

    @Operation(summary = "Удалить заказ", responses = {
            @ApiResponse(responseCode = "204", description = "Заказ успешно удалён"),
            @ApiResponse(responseCode = "404", description = "Заказ не найден")
    })
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteOrder(@PathVariable UUID id);

}
