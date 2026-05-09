package workingwithstrings;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        // constructor value is optional
        StringBuilder sb = new StringBuilder("Alex");
        sb.append(" loves Java");
        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", ");
        sb1.append("World");
        sb1.append("!");
        String greeting = sb1.toString();
    }
}

/*
    StringBuffer is an older version of StringBuilder allows you to modify the value of the text after it has been created
*/