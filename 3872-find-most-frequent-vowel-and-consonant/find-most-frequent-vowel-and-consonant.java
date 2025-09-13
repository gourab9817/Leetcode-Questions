class Solution {
    public int maxFreqSum(String s) {
        
      int max=0;
      int max2=0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(!isvowel(s.charAt(i))){
            int c=map2.getOrDefault(s.charAt(i),0)+1;
            map2.put(s.charAt(i),c);
            max=Math.max(max,c);
        }else{
            int d=map.getOrDefault(s.charAt(i),0)+1;
            map.put(s.charAt(i),d);
            max2=Math.max(max2,d);
        }
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