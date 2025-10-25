class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int buy=arr[0];
        for(int i:arr){
            max=Math.max(i-buy,max);
            buy=Math.min(buy,i);
        }
        return max;
    }
}