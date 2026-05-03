public class ExampleString {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hello";

        boolean same = s1.equals(s2); // False

        String upper = s1.toUpperCase(); // HI
        // s1 = s1.toUpperCase();

        String subString1 = s1.substring(1); // ello
        String subString2 = s1.substring(1, 2); // e

        boolean startsWith = s1.startsWith("h"); // True
        boolean endsWith = s1.endsWith("o"); // False

        int length = s1.length(); // 2
        char charAt = s2.charAt(3); // l 
    }
}