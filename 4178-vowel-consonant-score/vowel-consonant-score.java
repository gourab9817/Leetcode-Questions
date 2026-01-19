class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int C=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isvowel(c)){
                v++;
            }else if (!((c - '0' >= 0) && (c - '0' <= 9)) && c!=' '){
                C++;
            }
        }
        if(C>0){
        return v/C;
        }else{
            return 0;
        }
    }
    public static boolean isvowel(Character c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}