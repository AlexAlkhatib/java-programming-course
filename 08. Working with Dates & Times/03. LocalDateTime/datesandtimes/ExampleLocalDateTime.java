package datesandtimes;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        // current local datetime
        LocalDateTime ldt1 = LocalDateTime.now(); // 2026-05-10T09:05:03.091923675
        // create a local datetime
        LocalDateTime ldt2 = LocalDateTime.of(2026, 05, 10, 11, 01, 30); // 2026-05-10T11:01:30
        // parse a local datetime
        LocalDateTime ldt3 = LocalDateTime.parse("2026-05-10T11:01:30"); // 2026-05-10T11:01:30

        System.out.println(ldt1 + "\n" + ldt2 + "\n" + ldt3);

        // Methods on LocalDateTime
        LocalDateTime ldt4 = ldt1.minusWeeks(2); // 2026-04-26T09:18:38.466403567
        System.out.println(ldt4);
        //...
    }
}