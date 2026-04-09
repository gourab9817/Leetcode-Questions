class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                product*=nums[i];
            }else{
                count++;
            }
        }
        int arr[]=new int[nums.length];
        if(count==0){
        for(int i=0;i<nums.length;i++){            
            arr[i]=product/nums[i];    
        }
        }else if(count==1){
            for(int i=0;i<nums.length;i++){            
                if(nums[i]==0){
                    arr[i]=product; 
                }else{
                    arr[i]=0;
                }   
            }
        }else{
            for(int i=0;i<nums.length;i++){            
                arr[i]=0;    
            }
        }
        return arr;
    }
}  
