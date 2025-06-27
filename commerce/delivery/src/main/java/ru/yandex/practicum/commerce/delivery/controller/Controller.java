package ru.yandex.practicum.commerce.delivery.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.commerce.delivery.service.DeliveryService;
import ru.yandex.practicum.interaction_api.dto.delivery.DeliveryDto;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;
import ru.yandex.practicum.interaction_api.interaction.DeliveryClient;

@RestController
@RequestMapping("${api.path}/delivery")
@RequiredArgsConstructor
public class Controller implements DeliveryClient {
    private final DeliveryService deliveryService;

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public DeliveryDto createDelivery(DeliveryDto deliveryDto) {
        return deliveryService.createDelivery(deliveryDto);
    }

    @PostMapping("/successful")
    @ResponseStatus(HttpStatus.OK)
    public void successfulDelivery(String paymentId) {
        deliveryService.successfulDelivery(paymentId);
    }

    @PostMapping("/picked")
    @ResponseStatus(HttpStatus.OK)
    public void pickedDelivery(String paymentId) {
        deliveryService.pickedDelivery(paymentId);
    }

    @PostMapping("/cost")
    @ResponseStatus(HttpStatus.OK)
    public Double calculateCost(OrderDto orderDto) {
        return deliveryService.calculateCost(orderDto);
    }
}
