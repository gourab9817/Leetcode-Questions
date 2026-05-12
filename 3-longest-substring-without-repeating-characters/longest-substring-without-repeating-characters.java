class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int a=0;
        int max=0;
        int i=0,j=0,val=0;

        while (j<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                a=map.get(c);
                i=a<i? i:a+1;
                map.put(c,j);
            }else{
                map.put(c,j);
            }
            val=j-i+1;
            max=Math.max(max,val);
            j++;

            
        }
        return max;
        
    }
}