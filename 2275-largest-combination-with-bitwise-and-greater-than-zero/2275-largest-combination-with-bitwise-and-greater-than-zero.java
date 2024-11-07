class Solution {
    public int largestCombination(int[] c) {
        int res = 0, cur = 0;
        for (int i = 0; i < 30; ++i) {
            cur = 0;
            for (int a : c)
                cur += a >> i & 1;
            res = Math.max(res, cur);
        }
        return res;
    }
}