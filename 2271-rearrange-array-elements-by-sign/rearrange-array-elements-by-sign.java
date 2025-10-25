class Solution {
    public int[] rearrangeArray(int[] arr) {
        int crr[]=new int[arr.length/2];
        int brr[]=new int[arr.length/2];
        int x=0;
        for(int i:arr){
            if(i<0){
                brr[x]=i;
                x++;
            }
        }
        x=0;
        for(int i:arr){
            if(i>0){
                crr[x]=i;
                x++;
            }
        }
        x=0;
        for(int j=0;j<arr.length-1;j+=2){
            arr[j]=crr[x];
            arr[j+1]=brr[x];
            x++;
        }

        return arr;

    }
}