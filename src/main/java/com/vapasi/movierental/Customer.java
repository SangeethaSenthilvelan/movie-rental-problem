package com.vapasi.movierental;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();
    public static final String PRINT_CUSTOMER_NAME_TEXT= "Rental record for ";
    public static final String PRINT_SPACE_NEWLINE= "\n";
    public static final String PRINT_SPACE_TAB = "\t";
    public static final String PRINT_AMOUNT_OWED_TEXT = "Amount owed is ";
    public static final String PRINT_FREQUENT_RENTER_POINTS_TEXT_PART_1 = "You earned ";
    public static final String PRINT_FREQUENT_RENTER_POINTS_TEXT_PART_2 = " frequent renter points";

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental){

        rental.calculateRentAmount();
        rental.calculateFrequentRenterPoints();
        rentals.add(rental);
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
        for( Rental rental : rentals) {
            statement.append(PRINT_SPACE_TAB);
            statement.append(rental.getMovie().getTitle().toString());
            statement.append(PRINT_SPACE_TAB);
            statement.append(rental.getRentAmount());
            statement.append(PRINT_SPACE_NEWLINE);
        }
        return statement;
    }
    private double getTotalRentalAmount()
    {
        Stream<Rental> rentalStreamOfValidRentsAmounts = rentals.stream().filter(rental -> rental.getRentAmount() != 0.0);

        double totalRentalAmount = rentalStreamOfValidRentsAmounts.mapToDouble(Rental::getRentAmount).sum();

        return totalRentalAmount;
    }

    private double getFrequentRenterPoint()
    {
        Stream<Rental> rentalStreamOfValidFrequentRenterPoints = rentals.stream().filter(rental -> rental.getFrequentRenterPoints() != 0.0);

        double totalFrequentRenterPoints = rentalStreamOfValidFrequentRenterPoints.mapToDouble(Rental::getFrequentRenterPoints).sum();

        return totalFrequentRenterPoints;
    }
}
