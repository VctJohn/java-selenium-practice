package intro;

public class sumofnumbers {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 56, 86, 15, 678};

        int total = 0; // This will store the sum

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i]; // Add each element to total
        }

        System.out.println("Sum of all elements: " + total);
    }
}