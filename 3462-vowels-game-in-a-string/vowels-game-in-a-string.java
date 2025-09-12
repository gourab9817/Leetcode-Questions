class Solution {
    public boolean doesAliceWin(String s) {
        ArrayList<Character> al = new ArrayList<>();
        int n=s.length();

        for (int i=0;i<n;i++){
            char c=s.charAt(i);
            if(isvowel(c)){
                al.add(c);
            }
        }
        int size=al.size();
        
        if(size>0&& size%2==0){
            return true;
        }else if (size>0 && size%2!=0){
            return true;
        }
        return false;
    }
    public static boolean isvowel(char a){
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
            return true;
        }
        return false;
    }
}