class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[n*n];
        int arr2[]=new int[2];
        for(int i=0;i<n*n;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(arr[grid[i][j]-1]==grid[i][j]){
                    arr[grid[i][j]-1]=0;
                }else{
                    arr2[0]=grid[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr2[1]=arr[i];
            }
        }
        return arr2;
    }
}