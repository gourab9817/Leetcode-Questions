class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int x:arr){
            if(x<min){
                min=Math.min(x,min);
            }else{
                profit=Math.max(profit,x-min);
            }
        }
        return profit;
    }
}