package com.Week4.List;

public class Students {
    private String FN;
    private String LN;
    private double GPA;


    public Students(String FN, String LN, double GPA) {
        this.FN = FN;
        this.LN = LN;
        this.GPA = GPA;
    }

    public String getFN() {
        return FN;
    }

    public String getLN() {
        return LN;
    }

    public double getGPA() {
        return GPA;
        }
    @Override
    public String toString() {
        return "Students{" +
                "FN='" + FN + '\'' +
                ", LN='" + LN + '\'' +
                ", GPA=" + GPA +
                '}';
    }

}

