package com.Week5.OptionalMethod;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDays {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 7, 3);

        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        int workingDays = 0;
        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            currentDate = currentDate.plus(1, ChronoUnit.DAYS);
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}
