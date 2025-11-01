class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
        int sub=Integer.MAX_VALUE;
        int poi=-1;
        for(int j=i+1;j<n;j++){
            if(nums[j]>nums[i]){
                if(nums[j]<=sub){
                    sub=nums[j];
                    poi=j;
                }
            }
        }
        
        int temp=nums[i];
        nums[i]=nums[poi];
        nums[poi]=temp;
        }
        reverse(nums,i+1,n-1);

    }
    public static void reverse(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}