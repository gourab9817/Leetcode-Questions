class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int y=map.getOrDefault(i,0)+1;
            if (map.containsKey(i)) { // Check before incrementing
    return true;
} else {
    map.put(i, 1); // First occurrence
}
            
        }
        return false;
    }
}