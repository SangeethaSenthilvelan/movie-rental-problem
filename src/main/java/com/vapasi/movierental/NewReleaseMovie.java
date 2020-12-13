package com.vapasi.movierental;

public class NewReleaseMovie extends Movie{
    private static final double NEW_RELEASE_PRICE_BASE_CODE = 3;
    private static final int FREQUENT_RENTER_DAY_LIMIT_FOR_NEW_RELEASE = 1;
    private static final int POINTS = 2;

    public NewReleaseMovie(String title) {
        super(title);
    }
    @Override
    public void rentAmount(Rent rent) {
       super.setRent(rent.getDaysRented() * this.NEW_RELEASE_PRICE_BASE_CODE);
    }

    @Override
    public void points(Rent rent) {
        if(rent.getDaysRented() > this.FREQUENT_RENTER_DAY_LIMIT_FOR_NEW_RELEASE)
            super.setPoints(POINTS);
    }

}
