class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder("");
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)== ' '){
                i--;
            }
            int j=i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            if(j>=0){
                sb.append(s.substring(i+1,j+1)).append(" ");
            }

            
            
            
        }
        return sb.toString().trim();
    }
}