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
        
        return maxwater; // Return the result instead of printing
    }

    public static void main(String[] args) {
        // Example 1: Create and initialize the array
        int[] containerval = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxwater = maxArea(containerval);
        System.out.println(maxwater); // Expected output: 49

        // Example 2: Create and initialize the array
        int[] containerval2 = {1, 1};
        int maxwater2 = maxArea(containerval2);
        System.out.println(maxwater2); // Expected output: 1
    }
}
