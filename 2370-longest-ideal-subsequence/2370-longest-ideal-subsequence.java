class Solution {
    public int longestIdealString(String s, int k) {
        int res = 0, n = s.length(), dp[] = new int[150];
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i);
            for (int j = c - k; j <= c + k; j++)
                dp[c] = Math.max(dp[c], dp[j]);
            res = Math.max(res, ++dp[c]);
        }
        return res;
    }
}