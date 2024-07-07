package basicquestion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = scanner.nextInt();
        System.out.println("factorial" + " "+fact(num));

    }
    static int fact(int num ){
        if (num==1){
            return num;
        }
        return num * fact(num-1);
    }
}
