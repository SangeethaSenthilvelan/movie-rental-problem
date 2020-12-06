package com.vapasi.movierental;
public interface Movie {
    public static final double CHILDREN_PRICE_BASE_CODE = 1.5;
    public static final double REGULAR_PRICE_BASE_CODE = 2;
    public static final double NEW_RELEASE_PRICE_BASE_CODE = 0;

    public static final double CHILDREN_FACTOR = 1.5;
    public static final double REGULAR_FACTOR = 1.5;
    public static final double NEW_RELEASE_FACTOR = 3;

    public static final int CHILDREN_DAY_LIMIT = 3;
    public static final int REGULAR_DAY_LIMIT = 2;
    public static final int NEW_RELEASE_DAY_LIMIT = 0;

    double getPriceCode();
    double getFactor();
    int getDayLimit();
    String getTitle();

}
