package com.example.deliveryapi.controllers;

import com.example.deliveryapi.dto.REST.CreateDelivererRequest;
import com.example.deliveryapi.dto.REST.DelivererResponse;
import com.example.deliveryapi.dto.REST.UpdateDelivererRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.EntityModel;

import java.util.List;
import java.util.UUID;

@Tag(name = "Deliverers", description = "API для работы с курьерами")
@ApiResponses({
        @ApiResponse(responseCode = "200", description = "Успешная обработка запроса"),
        @ApiResponse(responseCode = "400", description = "Ошибка валидации"),
        @ApiResponse(responseCode = "404", description = "Ресурс не найден"),
        @ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера")
})
@RequestMapping("/api/deliverers")
public interface DelivererApi {

    @Operation(summary = "Получить всех курьеров")
    @GetMapping
    List<DelivererResponse> getAllDeliverers();

    @Operation(summary = "Получить курьера по ID")
    @GetMapping("/{id}")
    ResponseEntity<EntityModel<DelivererResponse>> getDeliverer(@PathVariable UUID id);

    @Operation(summary = "Создать нового курьера")
    @PostMapping
    DelivererResponse createDeliverer(@RequestBody CreateDelivererRequest request);

    @Operation(summary = "Обновить информацию о курьере")
    @PutMapping("/{id}")
    ResponseEntity<EntityModel<DelivererResponse>> updateDeliverer(@PathVariable UUID id, @RequestBody UpdateDelivererRequest request);

    @Operation(summary = "Удалить курьера")
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteDeliverer(@PathVariable UUID id);

}
