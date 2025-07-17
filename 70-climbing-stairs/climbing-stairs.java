class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+2];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        if(n==1||n==2||n==0){
            return n;
        }else{
                                            //Tabulation
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        }
        return dp[n];
    }

    // public int climbStairs(int n){
    //     if(n==0||n==1||n==2){
    //         return n;

    //     }
    //     return climbStairs(n-1)+climbStairs(n-2);
    // }

// public int climbStairs(int n,int dp[]){
//     dp[0]=0;
//     dp[1]=1;
//     dp[2]=2;
//     if(dp[n]!=0){
//         return dp[n];               // ,e,orization
//     }
//     dp[n]=climbStairs(n-1,dp)+climbStairs(n-2,dp);
//     return dp[n];
// }
}