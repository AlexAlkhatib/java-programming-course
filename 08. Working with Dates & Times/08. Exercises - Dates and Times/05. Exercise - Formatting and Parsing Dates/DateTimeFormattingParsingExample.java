import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        // Format a LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime); // 2026-05-10 16:21

        // Parse a date String into a LocalDate
        String dateString = "2026-05-10";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Parsed date: " + parsedDate); // 2026-05-10
    }
}