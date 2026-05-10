package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        // format with custom pattern
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        System.out.println(dtf.format(now)); // 05/10/2026
        System.out.println(dtf.format(today)); // 05/10/2026
        // MM/dd/yyyy -> 05/10/2026
        // MMM/dd/yyyy -> May/10/05
        // MMMM/d/yyyy -> full month, no zeros

        LocalDate ld = LocalDate.parse("July/06/1998", dtf);
        System.out.println(ld); // 1998-06-07

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
        DateTimeFormatter dtf1 = dtfb.appendLiteral("The date is: ")
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendLiteral("/")
            .appendValue(ChronoField.MONTH_OF_YEAR)
            .toFormatter();

        System.out.println(ld.format(dtf1)); // The date is: 10/05
    }
}