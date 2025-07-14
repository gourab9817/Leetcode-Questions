class Solution {
    public int maxDepth(String s) {
        Stack <Character> st=new Stack<>();
        int count =0;
        int maxcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                count++;
                maxcount=Math.max(count,maxcount);
            }else if(s.charAt(i)==')'){
                st.pop();
                count --;
            }
        }
        return maxcount;

    }
}