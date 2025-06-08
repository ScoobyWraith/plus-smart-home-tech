package ru.yandex.practicum.interaction_api.exception;

import org.springframework.http.HttpStatus;

public class NotAuthorizedUserException extends BaseHttpException {
    public NotAuthorizedUserException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
