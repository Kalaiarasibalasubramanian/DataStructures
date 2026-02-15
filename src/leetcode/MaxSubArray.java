package leetcode;

public class MaxSubArray {
    public static void main(String[] args) {
//        int[] nums =new int[]{1,12,-5,-6,50,3};
        int[] nums =new int[]{3,3,4,3,0};

//        System.out.println(  findMaxAverage(nums,4));
        System.out.println(  findMaxAverage(nums,3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length<=1){
            double output=nums[0];
            return output;
        }
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int maxSum=sum;
        for (int i = k; i < nums.length ; i++) {
            sum-=nums[i-k];
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
        }
        double output=maxSum/k;

        return output;
    }

}
