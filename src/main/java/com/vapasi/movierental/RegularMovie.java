package com.vapasi.movierental;

public class RegularMovie implements Movie{
    public static final double REGULAR_PRICE_BASE_CODE = 2;
    public static final double REGULAR_FACTOR = 1.5;
    public static final int REGULAR_DAY_LIMIT = 2;
    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    @Override
    public double getPriceCode() {
        return REGULAR_PRICE_BASE_CODE;
    }

    @Override
    public double getFactor() {
        return REGULAR_FACTOR;
    }

    @Override
    public int getDayLimit() {
        return REGULAR_DAY_LIMIT;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

}
