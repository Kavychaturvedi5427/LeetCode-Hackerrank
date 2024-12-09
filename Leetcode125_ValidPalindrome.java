import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Leetcode125_ValidPalindrome {
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            char cur = s.charAt(i);
            char charlast = s.charAt(j);
            if (!Character.isLetterOrDigit(cur)) {
                i++;
            } else if (!Character.isLetterOrDigit(charlast)) {
                j--;
            } else {

                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter string-->");
        String s=Scan.next();
        boolean op=isPalindrome(s);
        if(op==true){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
        Scan.close();
    }
}

