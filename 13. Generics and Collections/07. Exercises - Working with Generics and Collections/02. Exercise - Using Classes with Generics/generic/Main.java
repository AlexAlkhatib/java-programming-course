package generic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(5);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Outside of the box");
    }
}