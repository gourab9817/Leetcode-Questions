class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;       
        int min=min(arr,k);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum-min;
    }
    public static int min(int arr[],int k){
        int n=arr.length-k;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int minsum=sum;
        for(int i=n;i<arr.length;i++){
            sum+=arr[i]-arr[i-n];
            minsum=Math.min(minsum,sum);
        }
        return minsum;

    }
}