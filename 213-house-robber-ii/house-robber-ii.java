class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (n == 1) return nums[0];
        int[] excludeLast = new int[n - 1];
        int[] excludeFirst = new int[n - 1];
        for(int i=1;i<nums.length;i++){
            excludeFirst[i-1]=nums[i];
        }

        for(int i=0;i<nums.length-1;i++){
            excludeLast[i]=nums[i];
        }
        return Math.max(rob1(excludeLast),rob1(excludeFirst));
    }
    public int rob1(int[] nums) {
        int dp[]=new int[nums.length];
        if(2>nums.length){
            return nums[0];
        }        
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];
    }
}