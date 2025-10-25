class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=0;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:nums){
            int x=map.getOrDefault(i,0)+1;
            map.put(i,x);
            if(x>1){
                return true;
            }
        }
        return false;
        
    }
}