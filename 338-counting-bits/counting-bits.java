class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=help(i);

        }
        return arr;
    }
    public static int help(int n){
        String x=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}