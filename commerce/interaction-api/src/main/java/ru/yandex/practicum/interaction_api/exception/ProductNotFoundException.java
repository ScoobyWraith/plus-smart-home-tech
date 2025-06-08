package ru.yandex.practicum.interaction_api.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends BaseHttpException {
  public ProductNotFoundException(String message, HttpStatus httpStatus) {
    super(message, httpStatus);
  }
}