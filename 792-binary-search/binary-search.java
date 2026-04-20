class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        // return search3(nums,target,0,n-1);
        return search2(nums,target);
    }
    
    public int search2(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (nums[mid] == target) return mid;

            else if(nums[mid]<target){
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int search3(int[] nums, int target,int start,int end) {
        int n=nums.length;
        int mid=(start+end)/2;
        if (start > end) return -1;
        if(nums[mid]==target){
            return target;
        }
        if(nums[mid]>target){
            end=mid-1;
            return search3(nums,target,start,end);
        }else {
            start=mid+1;
            return search3(nums,target,start,end);
        }
        
    }
}