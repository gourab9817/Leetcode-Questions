class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int left=0,right=0,max=0;
        while(i<j){
            left=height[i];
            right=height[j];
            if(left<right){
                i++;
            }else{
                j--;
            }
            max=Math.max(max,(Math.min(left,right)*(j-i+1)));
        }
        return max;
    }
}