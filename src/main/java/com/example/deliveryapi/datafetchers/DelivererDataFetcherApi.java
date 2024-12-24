package com.example.deliveryapi.datafetchers;

import com.example.deliveryapi.dto.GraphQL.DelivererOutput;
import com.example.deliveryapi.dto.GraphQL.InputDeliverer;
import org.springframework.lang.Nullable;

import java.util.List;

public interface DelivererDataFetcherApi {
    //Получить список доставщиков.
    List<DelivererOutput> deliverers(@Nullable String nameFilter);


    //Добавить нового доставщика.
    DelivererOutput addDeliverer(InputDeliverer deliverer);


    //Обновить информацию о доставщике.
    DelivererOutput updateDeliverer(String id, InputDeliverer delivererInput);

    //Удалить доставщика по идентификатору.
    boolean deleteDeliverer(String id);
}
