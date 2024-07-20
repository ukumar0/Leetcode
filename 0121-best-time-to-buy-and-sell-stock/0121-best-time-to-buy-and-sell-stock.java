class Solution {
    public int maxProfit(int[] p) {
        int max = 0, m = 0;
        for(int i = 1; i < p.length; i++) {
            max = Math.max(0, max += p[i] - p[i-1]);
            m = Math.max(max, m);
        }
        return m;
    }
}