class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int x=0;
        int p=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
             x+=arr[i];
            
        }
        return p-x;
    }
}