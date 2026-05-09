public class Immutability {
    public static void main(String[] args) {
        String str = "hi";
        String upperCaseStr = str.toUpperCase();
        System.out.println("Original String: " + str); // hi
        System.out.println("Modified String: " + upperCaseStr); // HI
    }
}