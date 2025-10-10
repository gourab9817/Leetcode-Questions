class Solution {
    public int maximumEnergy(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = arr[i];
            if (i + k < n) dp[i] += dp[i + k];
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
