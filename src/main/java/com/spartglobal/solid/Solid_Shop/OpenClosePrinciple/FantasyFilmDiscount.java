package com.spartglobal.solid.Solid_Shop.OpenClosePrinciple;

public class FantasyFilmDiscount implements IFilmDiscount{
    private String discount;

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String filmDiscount() {
        return null;
    }
}
