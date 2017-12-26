package exceptions;

import exceptions.handlers.FirstExceptionHandler;

@HandledBy(FirstExceptionHandler.class)
public class FirstException extends RuntimeException {
    public FirstException() {
    }

    public FirstException(String message) {
        super(message);
    }

    public FirstException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstException(Throwable cause) {
        super(cause);
    }

    public FirstException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
