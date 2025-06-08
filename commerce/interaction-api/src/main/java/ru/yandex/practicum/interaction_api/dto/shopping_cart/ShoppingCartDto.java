package ru.yandex.practicum.interaction_api.dto.shopping_cart;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoppingCartDto {
    @NotBlank
    String shoppingCartId;

    @NotNull
    Map<String, Long> products;
}
