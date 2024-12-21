import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode448_FindAllNumbersDisappearedInAnArray {

    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Cycle sort implementation
    static void Cycle_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1; // Correct index for the current element , as the range starts from [0,n] we've used this if it starts from [1,n] then in that case we'll use index=value;..
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
    }

    // Find all missing numbers in the sorted array
    static List<Integer> check(int[] arr) {
        List<Integer> MissingNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                MissingNumbers.add(i + 1);
            }
        }
        return MissingNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array -->");
        int n = scan.nextInt();
        System.out.println("Enter the elements in the array -->");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The entered array is --> " + Arrays.toString(arr));
        Cycle_sort(arr);
        System.out.println("The sorted array is --> " + Arrays.toString(arr));
        List<Integer> missingNumbers = check(arr);
        System.out.println("The missing numbers are --> " + missingNumbers);
        scan.close();
    }
}
