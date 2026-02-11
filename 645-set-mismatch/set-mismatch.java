class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        long S = 0, Sq = 0;

        for (int num : nums) {
            S += num;
            Sq += (long) num * num;
        }

        long Sn = (long) n * (n + 1) / 2;
        long Sqn = (long) n * (n + 1) * (2L * n + 1) / 6;

        long diff1 = S - Sn;       // d - m
        long diff2 = Sq - Sqn;     // d^2 - m^2

        long sumDM = diff2 / diff1; // d + m

        long d = (diff1 + sumDM) / 2;
        long m = d - diff1;

        return new int[]{(int) d, (int) m};
    }
}
