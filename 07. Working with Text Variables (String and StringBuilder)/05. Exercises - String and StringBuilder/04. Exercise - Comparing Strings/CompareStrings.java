public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.compareTo(str2)); // -15

        str2 = "Hello";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.compareTo(str2)); // 0
    }
}