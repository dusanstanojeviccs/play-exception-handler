package exceptions.handlers;

import com.google.inject.Inject;
import controllers.HomeController;

public class SecondExceptionHandler implements ExceptionHandler {
    @Inject
    HomeController homeController;

    @Override
    public void handleException() {
        System.out.println("Handling second exception");
        if (homeController != null) {
            System.out.println("Injections work in exceptions");
        }
    }
}
