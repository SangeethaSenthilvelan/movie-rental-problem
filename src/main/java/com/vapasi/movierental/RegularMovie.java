package com.vapasi.movierental;

public class RegularMovie implements Movie{
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
