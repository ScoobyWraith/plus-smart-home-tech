package ru.yandex.practicum.interaction_api.exception;

import org.springframework.http.HttpStatus;

public class NoProductsInShoppingCartException extends BaseHttpException {
    public NoProductsInShoppingCartException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
