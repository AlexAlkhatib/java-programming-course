package maps;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("Alex", 27);
        nameAgesMap.put("Maria", 32);
        nameAgesMap.put("Lola", 25);
        // nameAgesMap.put(2, "hi"); -> this is not allowed

        // print the map
        System.out.println(nameAgesMap); // {Alex=27, Maria=32, Lola=25}
        // get value by key
        System.out.println(nameAgesMap.get("Alex")); // 27

        // iterate over map values
        for(Integer i : nameAgesMap.values()) {
            System.out.println(i);
        }

        // loop over keys
        for(String s : nameAgesMap.keySet()) {
            System.out.println(s + " : " + nameAgesMap.get(s)); // Alex : 27 ...
        }

        // map through the entry
        for(Map.Entry<String, Integer> entry : nameAgesMap.entrySet()) {
            System.out.println(entry.getKey()); // Alex Maria lola
            System.out.println(entry.getValue()); // 27 32 25
        }
        // entry.setKey(), entry.setValue()

        nameAgesMap.remove("Lola");
        nameAgesMap.put("Maaike", 32);
    }
}