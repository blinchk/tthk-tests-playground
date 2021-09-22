package com.laus.entities.tests;

import com.laus.entities.Greeter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    private final Greeter greeter;

    public GreeterTest() {
        greeter = new Greeter();
    }

    @Test
    public void greet_Bob() {
        String expected = "Hello, Bob.";
        Assertions.assertEquals(expected, greeter.greet("Bob"));
    }

    @Test
    public void greet_nameIsEmptyString() {
        String expected = "Hello, my friend.";
        Assertions.assertEquals(expected, greeter.greet(""));
    }

    @Test
    public void greet_nameIsWhiteSpace() {
        String expected = "Hello, my friend.";
        Assertions.assertEquals(expected, greeter.greet(" "));
    }

    @Test
    public void greet_nameNull() {
        String expected = "Hello, my friend.";
        Assertions.assertEquals(expected, greeter.greet(null));
    }
}
