package ru.yandex.practicum.commerce.order.service;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.commerce.order.mapper.OrderMapper;
import ru.yandex.practicum.commerce.order.storage.OrderRepository;
import ru.yandex.practicum.interaction_api.dto.order.CreateNewOrderRequest;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;
import ru.yandex.practicum.interaction_api.dto.order.ProductReturnRequest;
import ru.yandex.practicum.interaction_api.exception.NotAuthorizedUserException;
import ru.yandex.practicum.interaction_api.exception.ProductInShoppingCartLowQuantityInWarehouse;
import ru.yandex.practicum.interaction_api.interaction.DeliveryClient;
import ru.yandex.practicum.interaction_api.interaction.WarehouseClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    private final OrderMapper orderMapper;
    private final WarehouseClient warehouseClient;
    private final DeliveryClient deliveryClient;

    @Override
    public List<OrderDto> getOrders(String username) {
        checkUsername(username);
        return repository.findAllByUsername(username).stream()
                .map(orderMapper::toOrderDto)
                .toList();
    }

    @Override
    public OrderDto createOrder(CreateNewOrderRequest request) {
        try {
            warehouseClient.checkQuantity(request.getShoppingCart());
        } catch (FeignException e) {
            throw new ProductInShoppingCartLowQuantityInWarehouse(
                    "Product not enough.",
                    HttpStatus.BAD_REQUEST.toString()
            );
        }










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

    private void checkUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new NotAuthorizedUserException("Empty username.", HttpStatus.UNAUTHORIZED.toString());
        }
    }
}
