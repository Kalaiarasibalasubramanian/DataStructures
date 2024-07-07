package LinearSearch;

import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][];
        System.out.println(arr);
        for (int row = 0; row < args.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= in.nextInt();

            }
            System.out.println();
        }



    }


}
