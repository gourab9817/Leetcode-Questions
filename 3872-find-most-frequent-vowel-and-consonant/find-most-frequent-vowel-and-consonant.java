class Solution {
    public int maxFreqSum(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(!isvowel(s.charAt(i))){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }else{
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
      }  
      ArrayList<Integer> al=new ArrayList<>(map.values());
      ArrayList<Integer> al2=new ArrayList<>(map2.values());
      int max=0;
      int max2=0;
      for(int i=0;i<al.size();i++){
        max=Math.max(max,al.get(i));
        
      }
      for(int i=0;i<al2.size();i++){
        max2=Math.max(max2,al2.get(i));
        
      }

      return max+max2;
    }
    public static boolean isvowel(char a){
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
            return true;
        }
        return false;
    }
}