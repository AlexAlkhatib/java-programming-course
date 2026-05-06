public class Main {
    public static void main(String[] args) {
        int age = 27;
        double ticketPrice;
        
        if (age < 5) {
            ticketPrice = 0;
        }
        else if (age >= 5 && age < 12) {
            ticketPrice = 5;
        }
        else if (age >= 12 && age < 18) {
            ticketPrice = 10;
        }
        else {
            ticketPrice = 15;
        }
        System.out.println("Ticket price: $" + ticketPrice);
    }
}