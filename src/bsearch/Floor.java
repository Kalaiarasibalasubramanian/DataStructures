package bsearch;
// Flooring: It'll print the element (index) Smaller than or equals to Target
public class Floor {
    public static void main(String[] args) {
        int[] arr= {1,66,77,88,100,432,500};
        int target = 180;
        int sol = floorBS(arr,target);
        System.out.println(sol);

    }
    static int floorBS(int[] arr, int target){
        int start= 0;
        int end= arr.length -1;
        while (start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid -1;
            } else if (arr[mid] < target){
                start = mid+1;
            }
        }
        return end;
    }
}
