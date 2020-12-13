package com.vapasi.movierental;

public class ChildrenMovie extends Movie{
    private static final double CHILDREN_PRICE_BASE_CODE = 1.5;
    private static final int CHILDREN_DAY_LIMIT = 3;

    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public void rentAmount(Rent rent) {
        int extraDays = 0;
        if(rent.getDaysRented()>this.CHILDREN_DAY_LIMIT)
            extraDays = rent.getDaysRented() -this.CHILDREN_DAY_LIMIT;
        super.setRent(this.CHILDREN_PRICE_BASE_CODE + (extraDays * this.CHILDREN_PRICE_BASE_CODE));
    }

}
