package com.vapasi.movierental;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void shouldReturnSuccessAfterRentMovieByCustomer() {

        Customer customer = new Customer("Mark");
        ChildrenMovie childrenMovie = new ChildrenMovie("Tom and Jerry");
        Rent rental = new Rent(2);

        boolean expected = customer.rentMovie(childrenMovie,rental);

        assertTrue(expected);

    }

    @Test
    public void shouldReturnSuccessOnAddingRental() {


        Customer customer = new Customer("Mark");
        ChildrenMovie childrenMovie = new ChildrenMovie("Tom and Jerry");
        ChildrenMovie childrenMovie1 = new ChildrenMovie("Madagascar");
        NewReleaseMovie newMovie = new NewReleaseMovie("Avatar 2.0");
        RegularMovie regularMovie = new RegularMovie("Titanic");
        Rent rental = new Rent(2);
        Rent rental3 = new Rent(7);
        Rent rental1 = new Rent(10);
        Rent rental2 = new Rent(10);
        customer.rentMovie(childrenMovie,rental);
        customer.rentMovie(newMovie,rental1);
        customer.rentMovie(regularMovie,rental2);
        customer.rentMovie(childrenMovie1,rental3);

        String actualOutput = customer.getStatement();

        assertNotNull(actualOutput);


    }
}
