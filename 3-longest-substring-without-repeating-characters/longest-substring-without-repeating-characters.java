class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            HashMap<Character, Integer> mp=new HashMap<>();
            int x=i;
            int j=i;
            while(j<n){
                char c=s.charAt(j);
                if(!mp.containsKey(c)){
                    mp.put(c,1);
                    
                    j++;
                }else{
                    break;
                }
                
            }
            max=Math.max(max,j-x);

        }
        return max;
    }
}