package com.vapasi.movierental;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Customer {

    private String name;
    private List<Movie> moviesRented = new ArrayList<Movie>();
    public static final String PRINT_CUSTOMER_NAME_TEXT= "Rental record for ";
    public static final String PRINT_SPACE_NEWLINE= "\n";
    public static final String PRINT_SPACE_TAB = "\t";
    public static final String PRINT_AMOUNT_OWED_TEXT = "Amount owed is ";
    public static final String PRINT_FREQUENT_RENTER_POINTS_TEXT_PART_1 = "You earned ";
    public static final String PRINT_FREQUENT_RENTER_POINTS_TEXT_PART_2 = " frequent renter points";

    public Customer(String name) {
        this.name = name;
    }

    public boolean rentMovie(Movie movie,Rent rent){
        movie.rentAmount(rent);
        movie.points(rent);
        return this.moviesRented.add(movie);
    }

    public String getStatement() {
        StringBuilder statement = new StringBuilder();
        statement.append(PRINT_CUSTOMER_NAME_TEXT);
        statement.append(this.name);
        statement.append(PRINT_SPACE_NEWLINE);
        getMovieRentalStatement(statement);
        statement.append(PRINT_AMOUNT_OWED_TEXT);
        statement.append(getTotalRentalAmount());
        statement.append(PRINT_SPACE_NEWLINE);
        statement.append(PRINT_FREQUENT_RENTER_POINTS_TEXT_PART_1);
        statement.append(getFrequentRenterPoint());
        statement.append(PRINT_FREQUENT_RENTER_POINTS_TEXT_PART_2);
        return statement.toString();
    }

    private StringBuilder getMovieRentalStatement(StringBuilder statement)
    {
        for( Movie movie : moviesRented) {
            statement.append(PRINT_SPACE_TAB);
            statement.append(movie.getTitle());
            statement.append(PRINT_SPACE_TAB);
            statement.append(movie.getRent());
            statement.append(PRINT_SPACE_NEWLINE);
        }
        return statement;
    }
    private double getTotalRentalAmount()
    {
        return moviesRented.stream().mapToDouble(Movie::getRent).sum();
    }

    private double getFrequentRenterPoint()
    {
       return moviesRented.stream().mapToInt(Movie::getPoints).sum();


    }
}
