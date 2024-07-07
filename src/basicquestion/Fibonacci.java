package basicquestion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        System.out.println("fibannaci num  :" + fibo(num));
        for (int i = 0; i < num ; i++) {
            System.out.println(fibo(i));
            
        }

    }
    static int fibo(int n ){
        if (n <= 1){
            return 1;
        }
       return   fibo(n-1)+fibo(n-2);
    }
}
