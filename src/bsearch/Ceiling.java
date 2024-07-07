package bsearch;


// ceiling : It will print the element(index) which is Greater than or equals to Target


public class Ceiling {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,10,77,100};
        int target = 9;
        int ans = ceiling(arr,target);
        System.out.println(ans);


    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<= end){
            int mid = start +(end - start)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                start=mid +1;
            }else if (arr[mid] > target){
                end = mid -1;
            }
        }
        return start;
    }
}
