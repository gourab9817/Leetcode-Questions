public class Solution {
    public static int maxArea(int[] containerval) {
        int maxwater = 0;
        int Lp = 0;
        int rp = containerval.length - 1;
        
        while (Lp < rp) {
            int width = rp - Lp;
            int height = Math.min(containerval[Lp], containerval[rp]);
            int water = width * height;
            if (maxwater < water) {
                maxwater = water;
            }

            // Move the pointer that points to the shorter line
            if (containerval[Lp] < containerval[rp]) {
                Lp++;
            } else {
                rp--;
            }
        }
        
        return maxwater; 
    }

    
}
