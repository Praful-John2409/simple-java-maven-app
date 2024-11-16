package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        Greeter greeter = new Greeter();
        String greeting = greeter.greet("World");
        System.out.println(greeting);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
