class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int best =0;
        for(int i:nums){
            set.add(i);
        }
        for(int x:set)
        {
            if(!(set.contains(x-1)))
            {
                int y = x, len=0;
                while(set.contains(y))
                {
                    len++;
                    y++;
                }
                best=Math.max(best,len);
            }
        }
        return best;
    }
}