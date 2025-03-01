import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> kt = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(c);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!kt.isEmpty()) kt.pop();
            } else {
                kt.push(c);
            }
        }

        while (!st.isEmpty() && !kt.isEmpty()) {
            if (st.peek() != kt.peek()) {
                return false;
            }
            st.pop();
            kt.pop();
        }

        return st.isEmpty() && kt.isEmpty(); 
    }
}
