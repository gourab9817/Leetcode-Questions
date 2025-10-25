class Solution {
    public int totalMoney(int n) {
        int x=0;
        int dp[]=new int[(n/7)+1];
        for(int i=0;i<dp.length-1;i++){
            int a0=i+1;
            int an=a0+6;
            dp[i]=7*(a0+an)/2;
        }
        x=dp.length;
        int end=x-1+n%7;
        int val=(n%7)*(x+end)/2;
        dp[dp.length-1]=val;
        int res=0;
        for(int k:dp){
            res+=k;
        }
        return res;
        

    }
}
//\(S_{n}=\frac{n}{2}(a_{1}+a_{n})=\frac{3}{2}(2+4)=\frac{3}{2}(6)=\mathbf{9}\)