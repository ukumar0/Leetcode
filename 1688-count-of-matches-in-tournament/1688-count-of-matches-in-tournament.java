class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        if (n == 1) {
            return result;
        } else if (n % 2 == 0) {
            result += n / 2;
            return result + numberOfMatches(n / 2);
        } else {
            result += (n - 1) / 2;
            return result + numberOfMatches((n - 1) / 2 + 1);
        }
    }
}