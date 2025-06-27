package ru.yandex.practicum.commerce.delivery.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.yandex.practicum.interaction_api.exception.BaseHttpException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseHttpException handleAnyException(final Exception e) {
        log.warn("500 {}", e.getMessage(), e);
        return new BaseHttpException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.toString());
    }
}