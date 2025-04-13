class Solution {
    // public static int helper(String s, String t,int i,int j){
    //     if(j<0){
    //         return 1;
    //     }
    //     if(i<0) return 0;
    //     if(s.charAt(i)==t.charAt(j)){
    //        return helper(s,t,i-1,j-1)+ helper(s,t,i-1,j);
    //     }else{
    //         return helper(s,t,i-1,j);
    //     }
        
    // }
    public static int numDistinct(String s, String t){
        // tabulization4
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }  
        }
        return dp[s.length()][t.length()];
    }
}