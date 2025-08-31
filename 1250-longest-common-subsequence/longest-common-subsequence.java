class Solution {
    //     static int dp[][];

    // public int longestCommonSubsequence(String s1, String s2) {
    //      int n=s1.length();
    //     int m=s2.length();
    //     dp=new int[n+1][m+1];
    //     int x=lcs2(s1,s2,n,m,dp);
    //     return x;
    // }
    // public static int lcs2(String a, String b,int n,int m,int dp[][]){
    //     if(n==0 || m==0){
    //         return 0;
    //     }
    //     if(dp[n][m]!=0){
    //         return dp[n][m];
    //     }
    //     if(a.charAt(n-1)==b.charAt(m-1)){
    //         dp[n][m]=1+lcs2( a,  b, n-1, m-1, dp);
    //     }else{
    //         dp[n][m]=Math.max(lcs2( a,  b, n, m-1, dp),lcs2( a,  b, n-1, m, dp));
    //     }
    //     return dp[n][m];
    // }

    public int longestCommonSubsequence(String s1, String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int [n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    
}

