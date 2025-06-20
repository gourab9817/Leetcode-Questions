class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]agrs){
        int target=0;
        int nums[]={4,5,6,7,0,1,2};
        Solution soultion=new Solution();
            int index= soultion.search(nums,target);
            if (index != -1) {
            System.out.println("The Searched item is found at index " + index);
            } else {
            System.out.println("The Searched item is not found");
            }
    }
}
