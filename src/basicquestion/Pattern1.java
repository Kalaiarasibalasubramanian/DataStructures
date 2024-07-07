package basicquestion;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a num:");
        int n = scanner.nextInt();

        pattern1(n);

    }

   static void pattern1(int n ) {
       for (int row = 1; row <= n; row++) {
           for (int col = 1; col <= row; col++) {
               System.out.print("* ");
           }
           System.out.println();

       }
   }

   static void pattern2(int  n ){
       for (int row = 1; row <=n ; row++) {
           for (int col = n; col <= n+1-row; col++) {
               
           }

       }
   }
}
