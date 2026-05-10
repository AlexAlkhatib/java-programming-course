package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExampleCalculating {
    public static void main(String[] args) {
        // Calculation with LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneHourFromNow = now.plusHours(1); // now.plus(Duration.ofHours(1))
        System.out.println(now + " + 1 hour = " + oneHourFromNow);

        // Calculation with LocalDate
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1); // today.minus(Period.ofYears(1))
        System.out.println(today + " one year ago: " + oneYearAgo);
    }
}