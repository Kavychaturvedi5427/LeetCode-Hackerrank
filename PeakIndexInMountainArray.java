import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInMountainArray {
    static int peakIndexInMountainArray(int[] arr) {
        int low = 1, high = arr.length - 2; // in order to skip first and last element
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array -->");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array -->");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("The elements of the array are -->" + Arrays.toString(arr));
        int op = peakIndexInMountainArray(arr);
        System.out.println("The peak index of the array is -->" + op);
        scan.close();
    }
}
