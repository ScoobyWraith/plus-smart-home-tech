package ru.yandex.practicum.interaction_api.exception;

import org.springframework.http.HttpStatus;

public class SpecifiedProductAlreadyInWarehouseException extends BaseHttpException {
    public SpecifiedProductAlreadyInWarehouseException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
