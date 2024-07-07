package bsearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 3, 5, 7, 10, 63, 89, 100};
        int target = 63;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] < target) {
                start = mid + 1; // Adjust start if target is in the right half
            } else {
                end = mid - 1; // Adjust end if target is in the left half
            }
        }

        return -1; // Target not found
    }
}
