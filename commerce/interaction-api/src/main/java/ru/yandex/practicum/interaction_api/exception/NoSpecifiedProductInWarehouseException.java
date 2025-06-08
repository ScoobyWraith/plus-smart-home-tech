package ru.yandex.practicum.interaction_api.exception;

import org.springframework.http.HttpStatus;

public class NoSpecifiedProductInWarehouseException extends BaseHttpException {
    public NoSpecifiedProductInWarehouseException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
