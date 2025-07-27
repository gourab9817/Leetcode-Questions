class Solution {
    public int findTargetSumWays(int[] nums, int target) {
    Map<String, Integer> memo = new HashMap<>();
    return calculate(nums, 0, 0, target, memo);
}

public int calculate(int[] nums, int i, int sum, int target, Map<String, Integer> memo) {
    String key = i + "," + sum;
    if (memo.containsKey(key)) return memo.get(key);
    if (i == nums.length) {
        return sum == target ? 1 : 0;
    }
    int add = calculate(nums, i + 1, sum + nums[i], target, memo);
    int subtract = calculate(nums, i + 1, sum - nums[i], target, memo);
    memo.put(key, add + subtract);
    return memo.get(key);
}


}