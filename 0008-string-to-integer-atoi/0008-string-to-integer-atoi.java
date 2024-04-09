class Solution {
    public int myAtoi(String s) {
        int result = 0;
        boolean negative = false;
        boolean started = false;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + digit;
                started = true;
            } else if (!started && c == ' ') {
                continue; // Skip leading spaces
            } else if (!started && (c == '-' || c == '+')) {
                negative = (c == '-');
                started = true;
            } else {
                break;
            }
        }

        return negative ? -result : result;
    }
}
