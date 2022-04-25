package com.custom_exception;

public class IncorrectAgeException extends Exception{
    public IncorrectAgeException() {
        super();
    }

    public IncorrectAgeException(String message) {
        super(message);
    }

    public IncorrectAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectAgeException(Throwable cause) {
        super(cause);
    }

    protected IncorrectAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
