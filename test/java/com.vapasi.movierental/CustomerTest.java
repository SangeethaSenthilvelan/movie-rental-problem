package com.vapasi.movierental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {


    @Test
    public void shouldReturnValidStatement() {

        Customer customer = new Customer("Mark");
        String actualOutput = customer.statement();
        String expectedOutput = null;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnSuccessOnAddingRental() {

        Customer customer = new Customer("Mark");
        Movie movie = new Movie("Day of tommorrow",1);
        Rental rental = new Rental(movie,2);
        customer.addRental(rental);

        String actualOutput = customer.statement();
        String expectedOutput = null;

        assertEquals(expectedOutput, actualOutput);


    }
}
