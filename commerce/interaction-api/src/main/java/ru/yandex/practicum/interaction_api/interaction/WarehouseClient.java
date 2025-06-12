package ru.yandex.practicum.interaction_api.interaction;

import ru.yandex.practicum.interaction_api.dto.shopping_cart.ShoppingCartDto;
import ru.yandex.practicum.interaction_api.dto.warehouse.BookedProductsDto;

public interface WarehouseClient {
    BookedProductsDto checkQuantity(ShoppingCartDto shoppingCartDto);
}
