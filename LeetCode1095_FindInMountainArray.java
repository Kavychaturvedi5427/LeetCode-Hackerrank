package Arrays.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode1095_FindInMountainArray {

    // Binary search function
    static int Searching(int[] arr, int target, int start, int end, boolean isASC) {
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    // Find peak index in the mountain array
    static int peakIndexinArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                // You are in the descending part of the mountain
                end = mid;
            } else {
                // You are in the ascending part of the mountain
                start = mid + 1;
            }
        }
        return start; // Peak index
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array -->");
        int n = scan.nextInt();

        if (n < 3) {
            System.out.println("Invalid input! A mountain array must have at least 3 elements.");
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array -->");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The input array is --> " + Arrays.toString(arr));
        System.out.println("Enter the target element -->");
        int target = scan.nextInt();

        int peak = peakIndexinArray(arr);
        System.out.println("The peak element is present at index --> " + peak);

        // Search in ascending part
        int result = Searching(arr, target, 0, peak, true);
        if (result == -1) {
            // Search in descending part
            result = Searching(arr, target, peak + 1, n - 1, false);
        }

        if (result != -1) {
            System.out.println("The target element is present at index --> " + result);
        } else {
            System.out.println("The target element is not present in the mountain array.");
        }

        scan.close();
    }
}
