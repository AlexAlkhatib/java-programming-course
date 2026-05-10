package datesandtimes;

import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {
        // Duration of Nanos, Milis, Seconds, Minutes, Hours, Days
        Duration d1 = Duration.ofNanos(1_000_000_000);
        Duration d2 = Duration.ofSeconds(100, 1000);
        Duration d3 = Duration.ofDays(7);

        // Period of Days, Weeks, Months, Years
        Period p1 = Period.ofDays(30);
        Period p2 = Period.ofWeeks(4);
        Period p3 = Period.ofMonths(12);
        Period p4 = Period.ofYears(1);

        // Methods
        Duration d4 = d3.plus(d1);
        System.out.println(p4.getDays()); // 365
    }
}