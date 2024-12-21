import java.util.Arrays;
import java.util.Scanner;

public class Leetcode287_FindDuplicateNumber {
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
            int correct_index = arr[i]; // Correct index for the current element , as the range starts from [0,n]
                                            // we've used this if it starts from [1,n] then in that case we'll use
                                            // index=value;..
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
    }

    static int check(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return arr[i];
            }
        }
        return -1;
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
        System.out.println("The duplicate element in the array is --> "+check(arr));        
        scan.close();
    }
}
