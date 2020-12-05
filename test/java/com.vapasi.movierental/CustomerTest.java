package com.vapasi.movierental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {


    @Test
    public void shouldReturnValidStatement() {

        Customer customer = new Customer("Mark");
        String actualOutput = customer.statement();
        String expectedOutput = null;

        assertEquals(expectedOutput, actualOutput);
    }
}
