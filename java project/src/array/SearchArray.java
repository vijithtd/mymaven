package array;
import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int searchValue, index = -1;

        // Read in the array values
        System.out.println("100,200,3,4,5,6,7,8,9:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Read in the search value
        System.out.println("3:");
        searchValue = input.nextInt();

        // Search for the value in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                index = i;
                break;
            }
        }

        // Print the results
        if (index == -1) {
            System.out.println(searchValue + " was not found in the array.");
        } else {
            System.out.println(searchValue + " was found at index " + index + " in the array.");
        }
    }
}
