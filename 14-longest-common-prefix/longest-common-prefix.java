class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int m=Integer.MAX_VALUE;
        int l=0;
        for(int i=0;i<strs.length;i++){
            int x=strs[i].length();
            if(x<m){
                m=x;
                l=i;
            }
        }
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<m;i++){
            char c=strs[l].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    return sb.toString();
                }
            }
            sb.append(c);
            
        }
       
       
        String sk=sb.toString();
        return sk;
    }
}