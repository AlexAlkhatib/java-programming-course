package enums;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Planet name: " + planet.getName());
            System.out.println("Distance from Sun: " + planet.getDistanceFromSun());
        }
    }
}