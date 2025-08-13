class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        Stack<Character> st2=new Stack<>();
        int n=s.length();
        int count =0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }else if(c==')'){
                if(!st.isEmpty()){
                    if(st.peek()=='('){
                        st.pop();
                    }
                }else{
                        st2.push(c);
                    }
            }
        }

        return st.size()+st2.size();
    }
}