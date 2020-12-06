package com.vapasi.movierental;

public class NewRelease implements Movie{
    private String title;

    public NewRelease(String title) {
        this.title = title;
    }

    @Override
    public double getPriceCode() {
        return NEW_RELEASE_PRICE_BASE_CODE;
    }

    @Override
    public double getFactor() {
        return NEW_RELEASE_FACTOR;
    }

    @Override
    public int getDayLimit() {
        return NEW_RELEASE_DAY_LIMIT;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
