package ru.yandex.practicum.commerce.delivery.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.interaction_api.dto.delivery.DeliveryDto;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public DeliveryDto createDelivery(DeliveryDto deliveryDto) {
        return null;
    }

    @Override
    public void successfulDelivery(String paymentId) {

    }

    @Override
    public void pickedDelivery(String paymentId) {

    }

    @Override
    public Double calculateCost(OrderDto orderDto) {
        return 0.0;
    }
}
