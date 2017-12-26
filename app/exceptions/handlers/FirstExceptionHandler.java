package exceptions.handlers;

public class FirstExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException() {
        System.out.println("Handling first exception");
    }
}
