package intro;

public class AscendingDecending {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 56, 86, 15, 678};

        System.out.println("Ascending (original order):");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Descending (reverse order):");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}