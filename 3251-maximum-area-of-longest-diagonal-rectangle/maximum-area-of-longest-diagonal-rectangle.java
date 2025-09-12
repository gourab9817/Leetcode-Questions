class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        long dp[]=new long[d.length];
        int arr[]=new int[d.length];
        for(int i=0;i<d.length;i++){
            int x=d[i][0];
            int y=d[i][1];
            dp[i] = (long) x * x + (long) y * y; 
            arr[i] = x * y;
        }
        long max=0;
        int res=0;
        for(int i=0;i<dp.length;i++){
            if (dp[i] > max) {      // new longer diagonal found
                max = dp[i];
                res = arr[i];
            } else if (dp[i] == max) { // same diagonal, pick max area
                res = Math.max(res, arr[i]);
            }
        }
        return res;
    }
}