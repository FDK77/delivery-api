package com.example.deliveryapi.datafetchers;

import com.example.deliveryapi.dto.GraphQL.InputOrder;
import com.example.deliveryapi.dto.GraphQL.OrderOutput;
import org.springframework.lang.Nullable;

import java.util.List;

public interface OrderDataFetcherApi {

    //Получить список заказов.
    List<OrderOutput> orders(@Nullable String customerNameFilter);


    //Добавить новый заказ.
    OrderOutput addOrder(InputOrder order);

    //Обновить информацию о заказе.
    OrderOutput updateOrder(String id, InputOrder orderInput);

    //Удалить заказ по идентификатору.
    boolean deleteOrder(String id);

}
