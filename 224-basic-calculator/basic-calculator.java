class Solution {
    public int calculate(String s) {
        Stack <Integer> st=new Stack<>();
        int sum=0;
        int curr=0;
        int ope=1;
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
             if (Character.isDigit(c)) {
                curr = curr * 10 + (c - '0'); 
            }

            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                sum=sum+(curr*ope);
                curr=0;

                if(c=='-'){
                    ope=-1;
                }else if(c=='+'){
                    ope=1;
                }else if(c=='('){
                    st.push(sum);
                    st.push(ope);
                    sum=0;
                    ope=1;
                }else if(c==')'){

                    sum *=st.pop();
                    sum +=st.pop();

                }
            }
            
            


        }
        return sum;
    }
}



