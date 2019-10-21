package com.spartglobal.solid.Solid_Shop;

import com.spartglobal.solid.Solid_Shop.students.Apprentice;
import com.spartglobal.solid.Solid_Shop.students.ManageStudent;
import com.spartglobal.solid.Solid_Shop.students.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
//        DiscountManger fantasyFilmDiscount = new FantasyFilmDiscount();
//        fantasyFilmDiscount.setDiscount("20%");
//        DiscountManager discountManager = new DiscountManager();

        student Anis = new student("Anis", "Subba", "JavaSDET");
//        ManageStudent manageStudent = new ManageStudent();
//        manageStudent.printName(Anis.getFirstName());
        Apprentice Naz = new Apprentice("Naz", "Mohammad", "JavaSDET");
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.getAllStudentDetails(Naz);


    }
}
