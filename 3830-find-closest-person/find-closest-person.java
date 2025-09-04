class Solution {
    public int findClosest(int x, int y, int z) {
        int a=z-x;
        int b=z-y;
        if(Math.abs(a)>Math.abs(b)){return 2;
        }else if(Math.abs(a)==Math.abs(b)){
        return 0;
        }else{
            return 1;
        }
    }
}