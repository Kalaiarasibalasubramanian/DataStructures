package bsearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={98,73,56,8,0,-1,-66};
        int target=98;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        Boolean isAsc = arr[start]<arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (arr[mid] < target) {
                    start = mid + 1; // Adjust start if target is in the right half
                } else {
                    end = mid - 1; // Adjust end if target is in the left half
                }
            }else {
                if (arr[mid] > target) {
                    start = mid + 1; // Adjust start if target is in the right half
                } else {
                    end = mid - 1; // Adjust end if target is in the left half
                }
            }

        }
        return -1; // Target
    }
}
