package com.yukibuwana.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertion() {
        //given
        Person person = new Person("Yuki", "Buwana");

        //than
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Yuki", "First Name failed"),
                () -> assertEquals(person.getLastName(), "Yuki Buwana", "Last Name failed"));

    }
}