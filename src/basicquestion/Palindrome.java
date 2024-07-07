package basicquestion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word: ");
        String str = scanner.next();
        System.out.println(ispalindrome(str));

    }
    static boolean ispalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)){
            return true;
        }else
           return false;
    }
}
