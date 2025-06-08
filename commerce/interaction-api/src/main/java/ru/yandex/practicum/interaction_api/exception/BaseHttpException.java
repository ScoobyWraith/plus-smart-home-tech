package ru.yandex.practicum.interaction_api.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseHttpException extends RuntimeException {
    public BaseHttpException(String message, HttpStatus httpStatus) {
        super(message);
        this.userMessage = message;
        this.httpStatus = httpStatus;
    }

    String userMessage;

    HttpStatus httpStatus;
}
