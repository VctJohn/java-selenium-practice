package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("John");
        a.add("J");
        a.add("o");
        a.add("h");
        a.add("n");

        // Print the 4th element
        System.out.println(a.get(3)); // Output: h

        // Print all elements
        for (String val : a) {
            System.out.println(val);
        }

        // Check if "o" is in the list
        System.out.println(a.contains("o")); // true

        // Array to List conversion and check
        String[] name = {"john", "kICK"};
        List<String> nameArrayList = Arrays.asList(name);

        System.out.println(nameArrayList.contains("kICK")); // true
        System.out.println(a.contains("kICK"));             // false
    }
}