package ru.yandex.practicum.commerce.delivery.service;

import ru.yandex.practicum.interaction_api.dto.delivery.DeliveryDto;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;

public interface DeliveryService {
    DeliveryDto createDelivery(DeliveryDto deliveryDto);

    void successfulDelivery(String paymentId);

    void pickedDelivery(String paymentId);

    Double calculateCost(OrderDto orderDto);
}
