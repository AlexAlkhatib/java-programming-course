package enums;

public class App {
    public static void main(String[] args) {
        DaysOfWeek day1 = DaysOfWeek.WEDNESDAY;
        DaysOfWeek day2 = DaysOfWeek.THURSDAY;

        if (day1 == day2) {
            System.out.println("The same day");
        }
        else {
            // Not the same day
            System.out.println("Not the same day");
        }

        System.out.println(day1.ordinal()); // 2
    }
}