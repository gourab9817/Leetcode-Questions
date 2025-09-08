class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        int a=0;
        int b=0;
        for(int i=1;i<n;i++){
            a=i;
           b=n-i;
            if(nonzero(a)>0 && nonzero(b)>0){
                arr[0]=a;
                arr[1]=b;
                break;
            }
        }
        
        return arr;


    }
    public int nonzero(int n){
        String x=Integer.toString(n);
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='0'){
                return 0;
            }
        }
        
        return n;
    }
}