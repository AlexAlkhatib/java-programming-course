public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int count = 0;

        // foreach loop
        for (int number : numbers) {
            // Odd number
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Average of odd numbers: " + average);
    }
}

// https://www.w3schools.com/java/java_howto_calculate_avg_array.asp
/*
    / An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;

    / Get the length of the array
    int length = ages.length;

    / Loop through the elements of the array
    for (int age : ages) {
    sum += age;
    }

    / Calculate the average by dividing the sum by the length
avg = sum / length;

    / Print the average
    System.out.println("The average age is: " + avg);
 */