package ru.yandex.practicum.commerce.payment.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.interaction_api.dto.order.OrderDto;
import ru.yandex.practicum.interaction_api.dto.payment.PaymentDto;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentDto createPayment(OrderDto orderDto) {
        return null;
    }

    @Override
    public Double calculateTotalCoast(OrderDto orderDto) {
        return 0.0;
    }

    @Override
    public void refund(String paymentId) {

    }

    @Override
    public Double calculateProductCoast(OrderDto orderDto) {
        return 0.0;
    }

    @Override
    public void failedPayment(String paymentId) {

    }
}
