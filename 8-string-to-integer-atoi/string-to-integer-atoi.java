class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() == 1 && (s.equals("+") || s.equals("-"))) {
            return 0;
        }
        
        int i = 0;
        boolean hasSign = false;
        boolean startedReading = false; // Track if we've started reading the number
        
        while (i < s.length()) {
            char c = s.charAt(i);
            
            // Skip leading whitespace only if we haven't started reading
            if (c == ' ' && !startedReading) {
                i++;
                continue;
            }
            
            // If we encounter any non-digit after starting, stop
            if (startedReading && !Character.isDigit(c)) {
                break;
            }
            
            // Handle sign
            if ((c == '-' || c == '+') && !startedReading) {
                sb.append(c);
                hasSign = true;
                startedReading = true;
            } else if (Character.isDigit(c)) {
                sb.append(c);
                startedReading = true;
            } else {
                // Any other character stops parsing
                break;
            }
            
            i++;
        }
        
        if (sb.length() == 0 || (sb.length() == 1 && (sb.charAt(0) == '+' || sb.charAt(0) == '-'))) {
            return 0;
        }
        
        String sk = sb.toString();
        try {
            return Integer.valueOf(sk);
        } catch (Exception e) {
            return sk.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}