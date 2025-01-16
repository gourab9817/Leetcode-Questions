class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList <Integer> al=new ArrayList<Integer>();
        int c=nums.length;
        for(int i=0;i<c;i++){
            if(nums[i]!=val){
                al.add(nums[i]);
            }
        }
        Integer arr[]=new Integer[al.size()];
        arr = al.toArray(arr);
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        return al.size();
    }
}