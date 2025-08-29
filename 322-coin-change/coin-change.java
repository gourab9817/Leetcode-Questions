class Solution {
    public int coinChange(int[] arr, int s) {
        int n=arr.length;
        int INF=1000000000;
        int dp[][]=new int[n+1][s+1];
        for(int i=0;i<=s;i++){
            dp[0][i]=INF;
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<s;i++ ){
            if(i%arr[0]==0){
                dp[0][i]=i/arr[0];
            }else{
                dp[0][i]=INF;
            }
        }
        

        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-arr[i-1]]);
                }else{ 
                    dp[i][j]=dp[i-1][j];
                    
                }
            }
        }
        if(dp[n][s]==1000000000){
            return -1;
        }
        return dp[n][s];
    }
}