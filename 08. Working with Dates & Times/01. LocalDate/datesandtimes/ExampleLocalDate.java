package datesandtimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        // current date
        LocalDate ld = LocalDate.now(); // 2026-05-10
        // date of a specified year
        LocalDate ld1 = LocalDate.of(1998, 7, 6); // 1998-07-06
        // create a local date by parsing a string
        LocalDate ld2 = LocalDate.parse("2026-05-10"); // 2026-05-10

        System.out.println(ld + " " + ld1 + " " + ld2);

        LocalDate ld3 = ld.plusDays(5);
        System.out.println(ld3); // 2026-05-15
        // minusDays() - plusMonths() - minusMonths() - plusYears() - minusYears()

        System.out.println(ld3.getYear()); // 2026
        System.out.println(ld3.getMonth()); // 05
        System.out.println(ld3.getDayOfMonth()); // 15
    }
}