package ru.yandex.practicum.commerce.order.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.interaction_api.dto.order.CreateNewOrderRequest;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;
import ru.yandex.practicum.interaction_api.dto.order.ProductReturnRequest;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDto getOrders(String username) {
        return null;
    }

    @Override
    public OrderDto createOrder(CreateNewOrderRequest request) {
        return null;
    }

    @Override
    public OrderDto returnOrder(ProductReturnRequest productReturnRequest) {
        return null;
    }

    @Override
    public OrderDto paymentOrder(String orderId) {
        return null;
    }

    @Override
    public OrderDto failedPaymentOrder(String orderId) {
        return null;
    }

    @Override
    public OrderDto deliveryOrder(String orderId) {
        return null;
    }

    @Override
    public OrderDto failedDeliveryOrder(String orderId) {
        return null;
    }

    @Override
    public OrderDto completedOrder(String orderId) {
        return null;
    }

    @Override
    public OrderDto calculateTotal(String orderId) {
        return null;
    }

    @Override
    public OrderDto assemblyOrder(String orderId) {
        return null;
    }

    @Override
    public OrderDto failedAssemblyOrder(String orderId) {
        return null;
    }
}
