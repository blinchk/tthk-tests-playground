package com.laus.entities;

public class Greeter {
    public String greet(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            return "Hello, my friend.";
        }
        return "Hello, " + name + ".";
    }
}
