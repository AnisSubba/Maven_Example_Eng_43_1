package com.spartglobal.solid.Solid_Shop.students;

import com.spartglobal.solid.Solid_Shop.OpenClosePrinciple.IFilmDiscount;

public class Apprentice implements IStudent {
    private String firstName;
    private String lastName;
    private String stream;
    private boolean hasLaptop;

    public Apprentice(String firstName, String lastName, String stream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stream = stream;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public boolean getLaptop() {
        return false;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }

}
