class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int left[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
            left[i]=mx;
        }
        int right[]=new int[n];
         mx=0;
        for(int i=n-1;i>=0;i--){
            mx=Math.max(mx,arr[i]);
            right[i]=mx;
        }
        int water=0;
        for(int i=0;i<n;i++){
            if(left[i]!=0 && right[i]!=0){
                water+=(Math.min(left[i],right[i]))-arr[i];
            }
        }
        return water;
    }
}