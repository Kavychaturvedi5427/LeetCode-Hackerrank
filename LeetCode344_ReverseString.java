import java.util.Arrays;
import java.util.Scanner;

public class LeetCode344_ReverseString {
    static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<=j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(s));
    }

    public static void main(String[] args) {
    }

}
