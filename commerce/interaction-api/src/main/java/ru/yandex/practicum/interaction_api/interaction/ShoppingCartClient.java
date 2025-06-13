package ru.yandex.practicum.interaction_api.interaction;

import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.interaction_api.dto.shopping_cart.ChangeProductQuantityRequest;
import ru.yandex.practicum.interaction_api.dto.shopping_cart.ShoppingCartDto;

import java.util.List;
import java.util.Map;

@FeignClient(name = "warehouse")
public interface ShoppingCartClient {
    @GetMapping("/api/v1/shopping-cart")
    ShoppingCartDto getShoppingCart(String username);

    @PutMapping("/api/v1/shopping-cart")
    ShoppingCartDto addToShoppingCart(String username, Map<String, Long> products);

    @DeleteMapping("/api/v1/shopping-cart")
    void deactivateShoppingCart(String username);

    @PostMapping("/api/v1/shopping-cart/remove")
    ShoppingCartDto removeFromShoppingCart(String username, List<String> products);

    @PostMapping("/api/v1/shopping-cart/change-quantity")
    ShoppingCartDto changeQuantity(String username, ChangeProductQuantityRequest request);
}
