import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        if (m < 3 || n < 3) {
            System.out.println("Hourglass pattern is not possible for matrices smaller than 3x3.");
            sc.close();
            return;
        }
        
        int[][] arr = new int[m][n];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        
        int res = maxSum(arr);
        System.out.println("Maximum Hourglass Sum: " + res);
    }

    public static int maxSum(int[][] arr) {
        int maxHourGlassSum = Integer.MIN_VALUE;
        
        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr[0].length - 3; j++) {
                int currentHourGlassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                                        + arr[i + 1][j + 1]
                                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxHourGlassSum = Math.max(maxHourGlassSum, currentHourGlassSum);
            }
        }
        return maxHourGlassSum;
    }
}
