package com.Week4.Day01;


import java.util.ArrayList;
import java.util.List;

public class StudentsAverage {

    public static void main(String[] args) {

        List<Students> st = new ArrayList<Students>();
        st.add(new Students("Venkat","Pasumarthi",3.81));
        st.add(new Students("Rohit","Kurapati",3.2));
        st.add(new Students("Alice","Smith",2.81));
        st.add(new Students("Ryan","Davis",2.5));

        double totalGpa = 0.00;
        for(int i=0;i<st.size();i++) {
            Students s = st.get(i);
            totalGpa += s.getGPA();
        }

        double avgGpa= totalGpa/ st.size();
        System.out.println("average gpa: "+avgGpa);

        st.stream()
                .filter(s ->s.getGPA() > avgGpa )
                .forEach(std -> System.out.println(std.getFN() +" "+std.getLN()+" "+std.getGPA()));





    }

}
