package ru.yandex.practicum.shopping_cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ShoppingCart {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCart.class, args);
    }
}
