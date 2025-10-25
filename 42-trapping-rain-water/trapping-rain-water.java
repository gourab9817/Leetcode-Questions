class Solution {
    public int trap(int[] arr) {
        int n=arr.length;

        int left[]=new int [n];
        int leftmax=arr[0];
        int right[]=new int[n];
        int rightmax=arr[n-1];
        for(int i=0;i<n;i++){
            leftmax=Math.max(leftmax,arr[i]);
            left[i]=leftmax;
        }
        for(int i=n-1;i>=0;i--){
            rightmax=Math.max(rightmax,arr[i]);
            right[i]=rightmax;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(right[i],left[i])-arr[i];
        }
        return sum;
    }
}