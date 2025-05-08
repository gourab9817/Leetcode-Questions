public class Solution {
    public static int maxSubArray(int nums[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentsum = Math.max(nums[i],currentsum + nums[i]);
            maxsum=Math.max(currentsum,maxsum);   
        }
        System.out.println("The maximum sub array sum is " + maxsum);
        return maxsum;
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        maxSubArray(nums);
    }
}
