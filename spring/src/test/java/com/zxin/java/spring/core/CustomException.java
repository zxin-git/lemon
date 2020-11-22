package com.zxin.java.spring.core;

import org.springframework.lang.Nullable;

/**
 * @author zxin
 */
public class CustomException extends RuntimeException {

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException(@Nullable String msg, @Nullable Throwable cause) {
        super(msg, cause);
    }

}
