public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        System.out.println("Length: " + str.length()); // 13
        System.out.println("UPPERCASE: " + str.toUpperCase()); // HELLO, WORLD!
        System.out.println("lowercase: " + str.toLowerCase()); // hello, world!
        System.out.println("Substring(7, 12): " + str.substring(7, 12)); // World
        System.out.println("Replace: " + str.replace("World", "Java")); // Hello, Java!
    }
}