package com.laus.entities;

public class Greeter {
    public String greet() {
        return "Hello, my friend.";
    }

    public String greet(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            return greet();
        }
        return "Hello, " + name + ".";
    }
}
