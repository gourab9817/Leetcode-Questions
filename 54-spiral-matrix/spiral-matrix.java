class Solution {
    public static List<Integer> spiralOrder(int arr[][]) {
        int startrow = 0;
        int startcolumn = 0;
        int endrow = (arr.length - 1);
        int endcolumn = arr[0].length - 1;
        List<Integer> result = new ArrayList<>();

        while (startrow <= endrow && startcolumn <= endcolumn) {
            // top
            for (int j = startcolumn; j <= endcolumn; j++) {
                result.add(arr[startrow][j]);
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(arr[i][endcolumn]);
            }
            // bottom
            for (int j = endcolumn - 1; j >= startcolumn; j--) {
                if (startrow == endrow) {
                    break;
                }
                result.add(arr[endrow][j]);
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcolumn == endcolumn) {
                    break;
                }
                result.add(arr[i][startcolumn]);
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;

        }
        System.out.println();
        return result;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of row");
        // int m = sc.nextInt();
        // System.out.println("Enter the number of column");
        // int n = sc.nextInt();

        int arr[][] = { { 1, 2, 3},
                { 4,5, 6 },
                { 7,8,9} };

        // int k = 3;
        // System.out.println("Enter the array elements");
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        List<Integer> result = spiralOrder(arr);
        System.out.println(result);
    }
}