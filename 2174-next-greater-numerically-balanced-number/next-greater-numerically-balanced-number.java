class Solution {
    public int nextBeautifulNumber(int n) {
        int i=n+1;
        int j=n;
        while(j<i){
            if(check(i)){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
    public static boolean check(int n){
        String s=String.valueOf(n);
        if (s.contains("0")) return false; 
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cx=s.charAt(i);
            if(cx-'0' !=0){
                map.put(cx,map.getOrDefault(cx,0)+1);
            }
        }
        ArrayList<Character> al=new ArrayList<>(map.keySet());
        ArrayList<Integer> al2=new ArrayList<>(map.values());
        // int k=0;
        // for(int i=0;i<al.size();i++){
        //     k+=al.get(i)-'0';
        // }
        for(int i=0;i<al.size();i++){
            int p=al.get(i)-'0';
            int q=al2.get(i);
            if(p!=q ){
                return false;
            }
        }
        return true;
    }
}