class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=1;
        int zero=0;
        for(int i : nums){
            count *= i==0 ? zero+=1 & 1:i;
        }
        int returnarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zero==1){
                returnarr[i]= nums[i]==0 ? count : 0;
            }else if(zero>1){
                returnarr[i]=0;
            }
            else{
                returnarr[i]=count/nums[i];
            }
            
        }
        return returnarr;
    }
}
// I ave writtin this code