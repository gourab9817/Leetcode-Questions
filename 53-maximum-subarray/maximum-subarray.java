class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                min=Math.max(min,nums[i]);
                x++;
            }
            if(x==nums.length){
                return min;
            }
        }
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}