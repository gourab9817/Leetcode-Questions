class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n=s.length();
        
        Stack<String> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if (s.charAt(i) == ' ') continue;
            int j=i;
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            
            String sub=s.substring(i,j);
            st.push(sub);
            i=j-1;
            

        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if (!st.isEmpty()) sb.append(' ');
            
        }
        String str=sb.toString();
        
        return str;
    }
}