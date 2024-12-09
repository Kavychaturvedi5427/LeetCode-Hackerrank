import java.util.Arrays;
import java.util.Scanner;


// wrap around means --> if there is no element that is greater than the targte element then we'll return the first element ..


public class Leetcode744_FindSmallestLetterGreaterThanTarget {

    static char tofind(char[] str, char target){
        int low=0,end=str.length-1;
        while (low<=end) {
            int mid=(low+(end-low)/2);
            if (str[mid]>target){
                end=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return str[low];
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of characters you want to insert in the array -->");
        int n=scan.nextInt();
        char[] str=new char[n];
        for(int i=0;i<n;i++){
            str[i]=scan.next().charAt(0);
        }
        System.out.println("The entered character array is -->"+Arrays.toString(str));
        System.out.println("Enter the targetted character-->");
        char target=scan.next().charAt(0);
        char op=tofind(str, target);
        System.out.println(op);
        scan.close();
    }
}
