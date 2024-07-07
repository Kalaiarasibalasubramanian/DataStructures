package cyclicSort;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
       int[] num ={3,1,2,4,5};
       sort(num);
        System.out.println(Arrays.toString(num));


    }
    static void sort(int[] num){
        int i  =0;

        while (i < num.length){
            int value = num[i] -1;
            if (num[i] != num[value]){
                swap(num , i , value);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] num,int a,int b){
        int temp = num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}
