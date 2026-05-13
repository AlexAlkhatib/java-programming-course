package enums;

public enum Planet {
    // enums
    MERCURY("Mercury", 0.39),
    VENUS("Venus", 0.72),
    EARTH("Earth", 1),
    MARS("Mars", 1.52),
    JUPYTER("Jupiter", 5.2),
    SATURN("Saturn", 9.54),
    URANUS("Uranus", 19.2),
    NEPTUNE("Neptune", 30.06);

    // fields
    private final String name;
    private final double distanceFromSun;

    // constructors
    Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}