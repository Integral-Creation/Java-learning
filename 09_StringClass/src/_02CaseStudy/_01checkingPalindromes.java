package _02CaseStudy;

import java.util.Scanner;

public class _01checkingPalindromes {
    public static boolean isPalindrome(String s){
        // index of first character in a string
        int low = 0;

        // index of last character in a string
        int high = s.length() - 1;

        while(low < high){
            if(s.charAt(high) != s.charAt(low)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palidrome");
        }
        
        scanner.close();
    }
}
