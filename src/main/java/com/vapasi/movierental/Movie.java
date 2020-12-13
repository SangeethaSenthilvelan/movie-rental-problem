package com.vapasi.movierental;

public abstract class  Movie {
     protected String title;
     protected double rent;
     protected int points;
     protected  static final int POINTS = 1;

     public Movie(String title) {
          this.title = title;
     }

     abstract void rentAmount(Rent rent);

     void points(Rent rent){this.points=POINTS;}

     public String getTitle() {
          return title;
     }

     public double getRent() {
          return rent;
     }

     public int getPoints() {
          return points;
     }

     protected void setRent(double rent) {
          this.rent = rent;
     }

     protected void setPoints(int points) {
          this.points = points;
     }
}
