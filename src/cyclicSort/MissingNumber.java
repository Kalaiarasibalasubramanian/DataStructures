package cyclicSort;

// If, range is between o to N , then every element will be index = Value;
// If , range is between 1 to N , then every element in he index = Value - 1;


public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,0,4};
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int[] arr){
        int i =0;
        while (i < arr.length){
            int value = arr[i];
                    if(arr[i]<arr.length && arr[i] != arr[value]){
                        swap(arr,i,value);
                    }else {
                        i++;
                    }
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != arr.length){
                    return index;
                }

            }

        }
        return arr.length;

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
