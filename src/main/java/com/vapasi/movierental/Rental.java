package com.vapasi.movierental;

public class Rental {

    private Movie movie;
    private int daysRented;
    private double rentAmount;
    private double frequentRenterPoints;
    public static final int FREQUENT_RENTER_DAY_LIMIT_FOR_NEW_RELEASE = 1;


    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public double getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public Movie getMovie() {
        return movie;
    }

    public void calculateRentAmount() {
            this.rentAmount = this.movie.getPriceCode();
            if (this.daysRented > this.movie.getDayLimit())
                this.rentAmount += (this.daysRented - this.movie.getDayLimit()) * this.movie.getFactor();

    }
    public void calculateFrequentRenterPoints() {
       this.frequentRenterPoints++;
        if((this.movie) instanceof NewRelease && this.daysRented > FREQUENT_RENTER_DAY_LIMIT_FOR_NEW_RELEASE)
            this.frequentRenterPoints++;

    }


}
