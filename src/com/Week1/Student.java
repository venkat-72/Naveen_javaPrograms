package com.Week1;

public class Student {
    public String name;


    public String getName() {
        return name;

    }
    public void setName(String newName) {
        this.name = newName;
        System.out.println(newName);
    }
    public static void main(String[] args){
        Student n=new Student();

        n.setName("Venkat");
    }

}

