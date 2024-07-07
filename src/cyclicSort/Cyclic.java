package cyclicSort;




public class Cyclic {
    public static void main(String[] args) {

    }
    static void cyclic(int[] arr){
        int i =0;
        int correct = arr[i]-1;
        while (i<arr.length){
            if (arr[i]==arr[correct]){
                i++;
            }else {
                swap(arr,i,correct);
            }
        }
    }

    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
