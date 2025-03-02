package com.splitwise.Splitwise.common.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ResponseEnums {
    SUCCESS(HttpStatus.OK, "Request successful"),
    CREATED(HttpStatus.CREATED, "Resource created successfully"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "Resource not found"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "Invalid request"),
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error");

    private HttpStatus status;
    private String message;
}
