class Solution {
    // public int maxSubArray(int[] nums) {
    //     int arr[]=new int[nums.length];
    //     arr[0]=nums[0];
    //     for(int i=1;i<nums.length;i++){
    //         arr[i]=arr[i-1]+nums[i];
    //     }
    //     int mx=Integer.MIN_VALUE;
    //     for (int i=0;i<nums.length;i++){

    //         int start=i;
    //         for(int j=i;j<nums.length;j++){
    //             int end=j;

    //             int prefix= start==0 ? arr[end]:arr[end]-arr[start-1];
    //             mx=Math.max(mx,prefix);
    //         }
    //     }
    //     return mx;
    // }

    public int maxSubArray(int[] nums){
        int curr=0;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            mx=Math.max(curr,mx);
            curr = curr<=0 ? 0:curr;
            
        }
        return mx;
    }
}