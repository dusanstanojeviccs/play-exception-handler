import com.google.inject.Injector;
import com.typesafe.config.Config;

import exceptions.HandledBy;
import play.*;
import play.api.OptionalSourceMapper;
import play.api.UsefulException;
import play.api.routing.Router;
import play.http.DefaultHttpErrorHandler;
import play.mvc.Http.*;
import play.mvc.*;

import javax.inject.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Singleton
public class ErrorHandler extends DefaultHttpErrorHandler {
    Injector injector;

    @Inject
    public ErrorHandler(Config config, Environment environment,
                        OptionalSourceMapper sourceMapper, Provider<Router> routes,
                        Injector injector) {
        super(config, environment, sourceMapper, routes);
        this.injector = injector;
    }

    protected CompletionStage<Result> onDevServerError(RequestHeader request, UsefulException exception) {
        if (exception.cause.getClass().isAnnotationPresent(HandledBy.class)) {
            injector.getInstance(exception.cause.getClass().getAnnotation(HandledBy.class).value()).handleException();
        }

        return CompletableFuture.completedFuture(
                Results.ok("A server error occurred")
        );
    }
}