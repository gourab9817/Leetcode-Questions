class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forgot) {
        int dp[]=new int [n+1];
        dp[1]=1;
        // for(int i=1+delay;i<=1+forgot;i++){
        //     dp[i]=dp[i]+1;
            
        // }
        int mod=1000000007;
        for(int i=1;i<=n;i++){
            for(int j=i+delay;j<i+forgot && j<n+1;j++){
                
                dp[j]=(dp[i]+dp[j])%mod;
            }
        }
        int sum=0;
        for(int i=Math.max(0, n - forgot + 1);i<=n;i++){ // forgot karne k badle
             sum=(sum+dp[i])%mod;                                //  hum log isse count hi nehi kr rehe hai 
                                                    // hum log count hi waha se suru karenge jaha tak end forgot possible hai 
                                                    // which is (n-forgot-1);
            
        }
        return sum;
    }
}