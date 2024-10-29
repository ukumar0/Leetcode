class Solution {
    int m, n;
    int[] dir = {-1, 0, 1};

    int dfs(int i, int j, int[][] grid, int[][] dp) {
        if (dp[i][j] != -1) return dp[i][j];

        int res = 0;
        for (int x : dir) {
            int nrow = i + x;
            int ncol = j + 1;
            if (nrow >= 0 && nrow < m && ncol < n && grid[nrow][ncol] > grid[i][j]) {
                res = Math.max(res, 1 + dfs(nrow, ncol, grid, dp));
            }
        }
        return dp[i][j] = res;
    }

    public int maxMoves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int res = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        for (int i = 0; i < m; i++) {
            res = Math.max(res, dfs(i, 0, grid, dp));
        }
        return res;
    }
}
