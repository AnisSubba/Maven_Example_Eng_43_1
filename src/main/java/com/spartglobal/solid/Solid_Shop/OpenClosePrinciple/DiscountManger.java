package com.spartglobal.solid.Solid_Shop.OpenClosePrinciple;

public class DiscountManger  {

//    public void getFantasyFilmDiscount (FantasyFilmDiscount fantasyFilmDiscount){
//        System.out.println(fantasyFilmDiscount.getDiscount());
//    }

    public void processDiscount(IFilmDiscount iFilmDiscount){
        System.out.println(iFilmDiscount.filmDiscount());
    }

}
