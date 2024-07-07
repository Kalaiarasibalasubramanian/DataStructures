package basicquestion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("enter num1:");
        int num1 = scanner.nextInt();
        System.out.print("enter num2:");
        int num2 = scanner.nextInt();


        System.out.println("before swapping "+" "+num1+" "+num2);
        int temp = num1;
        num1 = num2;
        num2=temp;
        System.out.println("After swapping " +" "+num1+" "+num2);
    }

}
