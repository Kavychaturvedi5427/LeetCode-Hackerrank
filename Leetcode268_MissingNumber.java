import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

public class Leetcode268_MissingNumber {

    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static void cycleSort(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]!=arr.length && arr[i] != arr[correct]) swap(arr,i,correct);
            else i++;
        }
    }

    static int MissingNumber(int []arr){
        cycleSort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array -->");
        int n=scan.nextInt();
        System.out.println("Enter size of the array -->");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The entered array is -->"+Arrays.toString(arr));
        System.out.println(MissingNumber(arr));

        scan.close();
    }
}