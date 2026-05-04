package primitivevsobject;

public class Pass {
    public static void main(String[] args) {
        int i = 5;
        Person p = new Person();
        p.name = "Alex";
        changeStuff(i, p);
        System.out.println(i + " " + p.name); // 5 Alkhatib
    }

    private static void changeStuff(int i, Person p) {
        i = 7;
        p.name = "Alkhatib";
    }
}
