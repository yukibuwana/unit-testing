package com.yukibuwana.unittesting;

public class Greeting {
    public static final String HELLO = "hello";
    public static final String WORLD = "world";

    public String helloWorld() {
        return HELLO + " " + WORLD;
    }

    public String helloWord(String name) {
        return HELLO + " " + name;
    }
}
