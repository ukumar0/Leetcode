class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
         int totalRolls = rolls.length + n;
        int sumRolls = mean * totalRolls;
        int currentSum = 0;

        for (int roll : rolls) {
            currentSum += roll;
        }

        int requiredSum = sumRolls - currentSum;

        if (requiredSum < n || requiredSum > 6 * n) {
            return new int[0];
        }

        int baseValue = requiredSum / n;
        int remainder = requiredSum % n;

        int[] result = new int[n];
        Arrays.fill(result, baseValue);

        for (int i = 0; i < remainder; i++) {
            result[i]++;
        }

        return result;
    }
}