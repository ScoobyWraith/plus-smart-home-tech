package ru.yandex.practicum.interaction_api.interaction;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ru.yandex.practicum.interaction_api.dto.order.CreateNewOrderRequest;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;
import ru.yandex.practicum.interaction_api.dto.order.ProductReturnRequest;

@FeignClient(name = "order")
public interface OrderClient {
    @GetMapping("/api/v1/order")
    OrderDto getOrders(String username);

    @PutMapping("/api/v1/order")
    OrderDto createOrder(CreateNewOrderRequest request);

    @PostMapping("/api/v1/order/return")
    OrderDto returnOrder(ProductReturnRequest productReturnRequest);

    @PostMapping("/api/v1/order/payment")
    OrderDto paymentOrder(String orderId);

    @PostMapping("/api/v1/order/payment/failed")
    OrderDto failedPaymentOrder(String orderId);

    @PostMapping("/api/v1/order/delivery")
    OrderDto deliveryOrder(String orderId);

    @PostMapping("/api/v1/order/delivery/failed")
    OrderDto failedDeliveryOrder(String orderId);

    @PostMapping("/api/v1/order/completed")
    OrderDto completedOrder(String orderId);

    @PostMapping("/api/v1/order/calculate/total")
    OrderDto calculateTotal(String orderId);

    @PostMapping("/api/v1/order/assembly")
    OrderDto assemblyOrder(String orderId);

    @PostMapping("/api/v1/order/assembly/failed")
    OrderDto failedAssemblyOrder(String orderId);
}
