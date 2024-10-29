package com.Familyship.checkkuleogi.domains.child.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum ChildExceptionType {
    CHILD_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "해당 아이를 찾을 수 없습니다");

    private final HttpStatus status;
    private final String message;
}

