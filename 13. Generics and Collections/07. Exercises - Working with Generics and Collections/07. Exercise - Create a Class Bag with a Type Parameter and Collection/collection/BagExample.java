package collection;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Laptop");
        stringBag.addItem("Phone");
        stringBag.addItem("Charger");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(1);
        integerBag.addItem(2);
        integerBag.addItem(3);
    }
}