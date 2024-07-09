class Solution {
    public double averageWaitingTime(int[][] cus) {
        double wait = 0, cur = 0;
        for (int[] a: cus) {
            cur = Math.max(cur, 1.0 * a[0]) + a[1];
            wait += cur - a[0];
        }
        return 1.0 * wait / cus.length;
    }
}