package com.empresa.screenmatch.Exception;

public class ErrorConversionMinutsLongException extends RuntimeException {
    public final String message;

    public ErrorConversionMinutsLongException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
