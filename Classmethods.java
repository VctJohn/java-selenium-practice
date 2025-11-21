package intro;

public class Classmethods {

    public static void main(String[] args) {

        // String using literal
        String s5 = "hello";

        // String using 'new' keyword
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        // String split and manipulation
        String s = "Rahul Shetty Academy";
        String[] splittedString = s.split("Shetty");

        // Print parts of the split string
        System.out.println(splittedString[0]);        // Output: Rahul 
        System.out.println(splittedString[1]);        // Output:  Academy (with leading space)
        System.out.println(splittedString[1].trim()); // Output: Academy

        // Print characters of the string in reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}