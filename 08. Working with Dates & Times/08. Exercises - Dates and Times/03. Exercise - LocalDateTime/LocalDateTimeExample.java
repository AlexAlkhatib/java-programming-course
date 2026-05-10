import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime eventDateTime = LocalDateTime.of(2023, 11, 21, 18, 0);
        System.out.println("The event is on: " + eventDateTime); // 2023-11-21T18:00
    }
}