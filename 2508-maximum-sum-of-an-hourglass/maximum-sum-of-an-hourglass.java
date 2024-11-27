public class Solution {
    public static int maxSum(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        if(m<3 || n<3) return -1;
        int summ=Integer.MIN_VALUE;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                int sum2=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                summ=Math.max(summ,sum2);
            }
        }
        return summ;
    }
}
