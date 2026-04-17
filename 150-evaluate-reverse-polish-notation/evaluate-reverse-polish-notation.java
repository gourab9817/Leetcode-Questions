class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){

            if(!tokens[i].equals("+") && 
                !tokens[i].equals("-") && 
                !tokens[i].equals("*") && 
                !tokens[i].equals("/"))
            {
                st.push(tokens[i]);
            }else if(tokens[i].equals("+")){
                String a=st.pop();
                String b=st.pop();
                int c=Integer.valueOf(b)+Integer.valueOf(a);
                st.push(String.valueOf(c));
            }else if(tokens[i].equals("-")){
                String a=st.pop();
                String b=st.pop();
                int c=Integer.valueOf(b)-Integer.valueOf(a);
                st.push(String.valueOf(c));
            }else if(tokens[i].equals("*")){
                String a=st.pop();
                String b=st.pop();
                int c=Integer.valueOf(b)*Integer.valueOf(a);
                st.push(String.valueOf(c));
            }else if(tokens[i].equals("/")){
                String a=st.pop();
                String b=st.pop();
                int c=Integer.valueOf(b)/Integer.valueOf(a);
                st.push(String.valueOf(c));
            }
        }
        return Integer.valueOf(st.peek());
    }
}