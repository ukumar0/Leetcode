class Solution {
    public int maximumLength(int[] nums) {
        int[] sp = new int[2];
        int[] dp = new int[2];
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int curm = nums[i] % 2;
            sp[curm] = sp[curm] + 1;
            dp[curm] = Math.max(dp[curm], 1 + dp[1 ^ curm]);
        }
        
        return Math.max(Math.max(sp[0], sp[1]), Math.max(dp[0], dp[1]));
    }
}