package datesandtimes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {
    public static void main(String[] args) {
        // current zoned date time
        ZonedDateTime zdt1 = ZonedDateTime.now();
        // localdate.now() and zone ID
        ZonedDateTime zdt2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
        // Print all available zone ids in our system
        for(String zoneid : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneid);
        }

        // Methods on ZoneDateTime
        System.out.println("Zone: " + zdt1.getZone());
        System.out.println("Date: " + zdt1.getYear());
        System.out.println("Month: " + zdt1.getMonth());
        // ...
        // minus() & plus()

        ZonedDateTime zdt3 = zdt1.withZoneSameInstant(ZoneId.of("Egypt"));
        System.out.println(zdt3);
    }
}