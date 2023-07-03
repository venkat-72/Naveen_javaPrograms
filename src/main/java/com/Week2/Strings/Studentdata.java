package com.Week2.Strings;

public class Studentdata implements Comparable {
    public String firstName;
    public String lastName;
    public double gpa;

    public Studentdata(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object o) {
       return  this.lastName.compareTo(((Studentdata) o).lastName);
    }
    public void display()
    {


        System.out.println(firstName+","+lastName+","+gpa);


    }



}

