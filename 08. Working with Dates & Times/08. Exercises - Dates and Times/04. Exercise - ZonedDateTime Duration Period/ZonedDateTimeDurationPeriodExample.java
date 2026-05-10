import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        // ZoneDateTime for an overseas event
        ZonedDateTime overseasEvent = ZonedDateTime.of(2026, 5, 11, 9, 0, 0, 0, ZoneId.of("Europe/Paris"));
        System.out.println("Overseas Event: " + overseasEvent); // 2026-05-11T09:00+02:00[Europe/Paris]

        // Duration between start and end Local times
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration); // Duration: PT8H

        // Period between two local dates
        LocalDate starDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period period = Period.between(starDate, endDate);
        System.out.println("Period: " + period); // Period: P11M30D
    }
}