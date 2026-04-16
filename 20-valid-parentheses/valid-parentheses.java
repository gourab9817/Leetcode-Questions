class Solution {
    public boolean isValid(String s) {
        if(s.length()<2)return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                    char top=st.pop();
                    if(s.charAt(i)==')' && top!='(')return false;
                    
                    if(s.charAt(i)=='}' && top!='{')return false;
                    
                    if(s.charAt(i)==']' && top!='[')return false;
                
            }
        }
                
        return st.isEmpty();
    }
}
