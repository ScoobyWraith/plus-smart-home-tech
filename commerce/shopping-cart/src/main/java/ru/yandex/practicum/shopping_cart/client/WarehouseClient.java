package ru.yandex.practicum.shopping_cart.client;

import feign.FeignException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import ru.yandex.practicum.interaction_api.dto.shopping_cart.ShoppingCartDto;
import ru.yandex.practicum.interaction_api.dto.warehouse.BookedProductsDto;

@FeignClient(name = "warehouse")
public interface WarehouseClient extends ru.yandex.practicum.interaction_api.interaction.WarehouseClient {
    @Override
    @PostMapping("${api.path}/warehouse/check")
    BookedProductsDto checkQuantity(ShoppingCartDto shoppingCartDto) throws FeignException;
}
