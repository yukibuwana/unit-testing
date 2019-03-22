package com.yukibuwana.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void getBar() {
        Foo foo = new Foo();

        assertEquals("FooBar", foo.getBar());
    }
}