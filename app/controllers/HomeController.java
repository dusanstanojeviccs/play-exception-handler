package controllers;

import exceptions.FirstException;
import exceptions.SecondException;
import play.mvc.*;

public class HomeController extends Controller {

    public Result firstException() throws FirstException {
        throw new FirstException();
    }

    public Result secondException() throws SecondException {
        throw new SecondException();
    }

    public Result regular() {
        return ok("Hello World");
    }
}
