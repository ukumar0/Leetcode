class Solution {
    public int[][] restoreMatrix(int[] row, int[] col) {
        int m = row.length, n = col.length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0 ; j < n; ++j) {
                arr[i][j] = Math.min(row[i], col[j]);
                row[i] -= arr[i][j];
                col[j] -= arr[i][j];
            }
        }
        return arr;
    }
}