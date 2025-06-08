package ru.yandex.practicum.interaction_api.exception;

import org.springframework.http.HttpStatus;

public class ProductInShoppingCartLowQuantityInWarehouse extends BaseHttpException {
    public ProductInShoppingCartLowQuantityInWarehouse(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
