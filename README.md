[<img src="https://img.shields.io/travis/playframework/play-java-starter-example.svg"/>](https://travis-ci.org/playframework/play-java-starter-example)

# play-exception-handler

This is a demo application that demonstrates how you can do advanced error handling with Play.

## Running

Run this using [sbt](http://www.scala-sbt.org/). 

```
sbt run
```

And then go to http://localhost:9000 to see the running web application.

## Problem

There are multiple exceptions that will be thrown during apps runtime. There needs to be a mechanism that allows separate classes to handle these exceptions.

## Solution

Using HandledBy annotation in combination with ExceptionHandler interface.

All exception handlers must implement ExceptionHandler, like this:

```
public class FirstExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException() {
        System.out.println("Handling first exception");
    }
}
```

And the exception must be marked with HandledBy, like this:
```
@HandledBy(FirstExceptionHandler.class)
public class FirstException extends RuntimeException {
  ...
}
```
