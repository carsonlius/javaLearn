package com.carsonlius.chapter02.demo;

public class ErrorParamsException extends Exception {
    public ErrorParamsException() {
    }

    public ErrorParamsException(String message) {
        super(message);
    }

    public ErrorParamsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorParamsException(Throwable cause) {
        super(cause);
    }

    public ErrorParamsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    //    public ErrorParamsException(){super();};
//
//    public ErrorParamsException(String message){super(message);};
}
