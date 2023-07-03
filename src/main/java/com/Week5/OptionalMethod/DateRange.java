package com.Week5.OptionalMethod;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DateRange {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2022, 3, 15));
        dates.add(LocalDate.of(2003, 12, 15));
        dates.add(LocalDate.of(1998, 10, 11));
        dates.add(LocalDate.of(2022, 12, 31));

        LocalDate earliestDate = Collections.min(dates);
        LocalDate latestDate = Collections.max(dates);

        System.out.println("Earliest date: " + earliestDate);
        System.out.println("Latest date: " + latestDate);
    }
}
