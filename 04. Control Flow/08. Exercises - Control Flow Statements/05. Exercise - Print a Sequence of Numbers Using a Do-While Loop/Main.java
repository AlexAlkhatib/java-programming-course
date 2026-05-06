public class Main {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }
        while (i <= n);
    }
}

/*
    This code will be executed at-least one time
        int n = 10;
        int i = 10;

        do {
            System.out.println(i);
            i++;
        }
        while (i < n);
*/