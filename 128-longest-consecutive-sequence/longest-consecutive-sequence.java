class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(nums.length==0)return 0;
        for(int i=0;i<nums.length;i++){
            // map.put(map.getOrDefault(nums[i],0),1);
            map.put(nums[i], 1);
        }
        // int count=1;
        int max=1;
        for(int num:map.keySet()){
            if(!map.containsKey(num-1)){
                int current=num;
                int count=1;
            
            while(map.containsKey(current+1)){
                current++;
                count++;
            }
            max=Math.max(count,max);
            }
        }
        return max;
    }
}
