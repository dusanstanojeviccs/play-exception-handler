package exceptions;

import exceptions.handlers.FirstExceptionHandler;
import exceptions.handlers.SecondExceptionHandler;

@HandledBy(SecondExceptionHandler.class)
public class SecondException extends RuntimeException {
    public SecondException() {
    }

    public SecondException(String message) {
        super(message);
    }

    public SecondException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecondException(Throwable cause) {
        super(cause);
    }

    public SecondException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
