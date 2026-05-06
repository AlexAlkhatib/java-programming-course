public class Main {
    public static void main(String[] args) {
        int[] grades = {37, 54, 67, 82, 31, 45, 89};
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}