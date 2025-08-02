class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c0=0;
        int c1=0;
        int c2=0;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                c0++;
            }else if(nums[i]==1){
                c1++;
            }else if(nums[i]==2){
                c2++;
            }
            i++;
        }
       
        int idx=0;
        for(int k=0;k<c0;k++){
            nums[idx]=0;
            idx++;
        }
        for(int k=0;k<c1;k++){
            nums[idx]=1;
            idx++;
        }
        for(int k=0;k<c2;k++){
            nums[idx]=2;
            idx++;
        }
        // System.out.println(c2);
    }
    
}