package datesandtimes;

import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        // current local time
        LocalTime lt1 = LocalTime.now(); // 08:44:03.920261873
        // custom local time
        LocalTime lt2 = LocalTime.of(7, 30, 15); // 07:30:15
        // parse a local time
        LocalTime lt3 = LocalTime.parse("23:59:59"); // 23:59:59

        System.out.println(lt1 + " " + lt2 + " " + lt3);
        
        // plusHours() - minusHours() - plusMinutes() - minusMinutes() - plusSecons() - minusSeconds()
        LocalTime lt4 = lt1.plusHours(1); // 09:44:03.920261873
        System.out.println(lt4);

        System.out.println(lt4.getHour()); // 09
        System.out.println(lt4.getMinute()); // 44
        System.out.println(lt4.getSecond()); // 03
        System.out.println(lt4.getNano()); // 920261873
    }
}