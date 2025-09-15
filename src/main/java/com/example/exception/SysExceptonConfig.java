package com.example.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author Yandong
 *
 * @Date 2025-09-15
 */
@Component
public class SysExceptonConfig {
    @ExceptionHandler(BusinessException.class)
    public String handleBusinessException(BusinessException e) {
        return e.getMessage();
    }
}
