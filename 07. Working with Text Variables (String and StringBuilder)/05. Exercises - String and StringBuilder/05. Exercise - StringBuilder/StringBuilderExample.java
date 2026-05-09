public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println("Comparaison: " + sb1.equals(sb2)); // false
        System.out.println("Comparaison: " + sb1.toString().equals(sb2.toString())); // true
        System.out.println("Append: " + sb1.append(sb2)); // hellohello
        System.out.println("Reverse: " + sb1.reverse()); // olleholleh
    }
}