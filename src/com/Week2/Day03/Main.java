package com.Week2.Day03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        Studentdata[] studentdata=new Studentdata[10];
        try {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/C:/Users/DELL/Downloads/Studentdata.csv"));
            int i=0;
            line = br.readLine();
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] student = line.split(splitBy);


               studentdata[i]= new Studentdata(student[0],student[1],Double.parseDouble(student[2]));
               i++;
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        Arrays.sort(studentdata);
        for(Studentdata student : studentdata) {
            student.display();
        }


    }
}

