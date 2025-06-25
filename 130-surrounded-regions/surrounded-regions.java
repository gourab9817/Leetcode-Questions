class Solution {
    int m, n;

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        // Mark border-connected 'O's
        for (int j = 0; j < n; j++) {
            dfs(0, j, board);
            dfs(m - 1, j, board);
        }
        for (int i = 0; i < m; i++) {
            dfs(i, 0, board);
            dfs(i, n - 1, board);
        }

        // Final conversion
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    // Not connected to border -> captured
                    board[i][j] = 'X';
                } else if (board[i][j] == '.') {
                    // Marked safe area -> restore
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(int row, int col, char[][] board) {
        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != 'O') {
            return;
        }
        // Temporarily mark as safe
        board[row][col] = '.';
        dfs(row + 1, col, board);
        dfs(row - 1, col, board);
        dfs(row, col + 1, board);
        dfs(row, col - 1, board);
    }
}
