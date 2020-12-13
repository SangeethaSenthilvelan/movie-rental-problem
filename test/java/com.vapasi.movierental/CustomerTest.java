package com.vapasi.movierental;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {

    @Test
    public void shouldReturnSuccessAfterAddingRental() {

        Customer customer = new Customer("Mark");
        ChildrenMovie childrenMovie = new ChildrenMovie("Tom and Jerry");
        ChildrenMovie childrenMovie1 = new ChildrenMovie("Madagascar");
        NewReleaseMovie newMovie = new NewReleaseMovie("Avatar 2.0");
        RegularMovie regularMovie = new RegularMovie("Titanic");
        Rental rental = new Rental(childrenMovie,2);
        Rental rental3 = new Rental(childrenMovie1,7);
        Rental rental1 = new Rental(newMovie,10);
        Rental rental2 = new Rental(regularMovie,10);
        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String actualOutput = customer.statement();

        assertNotNull(actualOutput);
    }

    @Test
    public void shouldReturnSuccessOnAddingRental() {

        Customer customer = new Customer("Mark");
        ChildrenMovie childrenMovie = new ChildrenMovie("Tom and Jerry");
        NewReleaseMovie newMovie = new NewReleaseMovie("Avatar 2.0");
        RegularMovie regularMovie = new RegularMovie("Titanic");
        Rental rental = new Rental(childrenMovie,2);
        Rental rental1 = new Rental(newMovie,10);
        Rental rental2 = new Rental(regularMovie,10);
        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);

        String actualOutput = customer.statement();

        assertNotNull(actualOutput);


    }
}
