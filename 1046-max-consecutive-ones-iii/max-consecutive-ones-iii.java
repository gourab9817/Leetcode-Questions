class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int left=0;
        int right=0;
        int zero=0;
        int max=0;
        for(right=0;right<n;right++){
            if(arr[right]==0){
                zero++;
            }
            while(zero>k){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}