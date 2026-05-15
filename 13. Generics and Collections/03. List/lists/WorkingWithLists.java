package lists;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        // We cannot instantiate List, it's an interface, ArrayList is a class that implements the List interface
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("sugar");

        // We cannot use primitive types as generics
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(shoppingList); // ["eggs", "milk", "sugar"]
        System.out.println(numbers); // [1, 2, 3]

        System.out.println(shoppingList.get(0)); // eggs
        shoppingList.remove("sugar");
        System.out.println(shoppingList); // ["eggs", "milk"]
        boolean containsEggs = shoppingList.contains("eggs"); 
        System.out.println(containsEggs); // true
    }
}