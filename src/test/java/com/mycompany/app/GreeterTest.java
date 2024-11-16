package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Greeter class.
 */
public class GreeterTest {

    @Test
    public void testGreet() {
        Greeter greeter = new Greeter();
        String result = greeter.greet("Alice");
        assertEquals("Hello, Alice!", result);
    }

    @Test
    public void testGreetWithEmptyString() {
        Greeter greeter = new Greeter();
        String result = greeter.greet("");
        assertEquals("Hello, !", result);
    }

    @Test
    public void testGreetWithNull() {
        Greeter greeter = new Greeter();
        String result = greeter.greet(null);
        assertEquals("Hello, null!", result);
    }
}
