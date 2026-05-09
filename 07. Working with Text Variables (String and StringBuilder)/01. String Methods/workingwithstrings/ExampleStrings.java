package workingwithstrings;

public class ExampleStrings {
    public static void main(String[] args) {
        String str = "Hi all!";
        int length = str.length(); 
        System.out.println(length); // 7
        System.out.println(str.charAt(0)); // H
        System.out.println(str.indexOf("all")); // 3
        System.out.println(str.substring(3)); // all!
        System.out.println(str.substring(3, 5)); // all
        System.out.println(str.toUpperCase() + " " + str.toLowerCase()); // HI ALL!  hi all!

        String str1 = "     bla bla bla     ";
        System.out.println(str1.trim()); // bla bla bla
    }
}