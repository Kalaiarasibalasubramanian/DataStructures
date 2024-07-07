package basicquestion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = scanner.next();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String :" + reverse);

    }
}
