package com.Week5.OptionalMethod;
import java.time.LocalDate;
import java.time.Period;
public class AgeOfPerson {
        public static void main(String[] args) {
            // Birthdate in yyyy-mm-dd format
            String birthdateStr = "1998-08-24";

            LocalDate birthdate = LocalDate.parse(birthdateStr);

            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthdate, currentDate);

            System.out.println("Age: " + age.getYears() + " years" + " " + age.getMonths() + " months" +" "+ age.getDays() + " days");
        }
    }


