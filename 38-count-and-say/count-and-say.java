class Solution {
    public String countAndSay(int n) {
        String dp[]=new String[n+1];
        dp[0]="0";
        dp[1]="1";
        // dp[2]="11";
        // dp[3]="21";
        if(n>1){
        for(int x=2;x<=n;x++){
            String s=dp[x-1];
            int i=0;
            StringBuilder sb=new StringBuilder();
            while(i<s.length()){
                int count=1;
                int j=i;
                while(j<s.length()-1 && s.charAt(j)==s.charAt(j+1)){
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(s.charAt(i));
                i=j+1;
            }
            dp[x]=sb.toString();
        }
        }

        return dp[n];
    }
}