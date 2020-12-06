package com.vapasi.movierental;

public class Children implements Movie{
    private String title;

    public Children(String title) {
        this.title = title;
    }

    @Override
    public double getPriceCode() {
        return CHILDREN_PRICE_BASE_CODE;
    }

    @Override
    public double getFactor() {
        return CHILDREN_FACTOR;
    }

    @Override
    public int getDayLimit() {
        return CHILDREN_DAY_LIMIT;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
