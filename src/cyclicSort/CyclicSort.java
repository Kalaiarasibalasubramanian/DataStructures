package cyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5,8,6,7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        int i =0;
        while (i< arr.length){
            int value = arr[i]-1;
            if (arr[i] != arr[value]){
                swap(arr,i,value);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp =arr[a] ;
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
