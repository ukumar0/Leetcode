class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int currentMoney = 1;
        int week = 1;

        for (int i = 1; i <= n; i++) {
            total += currentMoney;
            currentMoney++;

            if (i % 7 == 0) {
                week++;
                currentMoney = week;
            }
        }

        return total;
    }
}