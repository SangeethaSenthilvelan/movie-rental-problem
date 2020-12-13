package com.vapasi.movierental;

public class RegularMovie extends Movie{
    private static final double REGULAR_PRICE_BASE_AMOUNT = 2;
    private static final double REGULAR_PRICE_BASE_CODE = 1.5;
    private static final int REGULAR_DAY_LIMIT = 2;

    public RegularMovie(String title) {
        super(title);
    }
    @Override
    public void rentAmount(Rent rent) {
        int extraDays = 0;
        if(rent.getDaysRented()>this.REGULAR_DAY_LIMIT)
            extraDays = rent.getDaysRented() -this.REGULAR_DAY_LIMIT;
        super.setRent(this.REGULAR_PRICE_BASE_AMOUNT + (extraDays * this.REGULAR_PRICE_BASE_CODE));

    }


}
