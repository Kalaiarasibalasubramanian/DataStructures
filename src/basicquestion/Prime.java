package basicquestion;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));

    }static boolean isPrime(int n ){
        if (n <= 1){
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n%i==0){
                    return false;
                }

            }
        }
        return true;
    }
}
