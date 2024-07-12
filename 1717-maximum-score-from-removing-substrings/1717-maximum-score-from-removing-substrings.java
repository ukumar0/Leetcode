class Solution {
        String result(String s, String r) {
        Stack<Character> x = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == r.charAt(1) && !x.empty() && x.peek() == r.charAt(0)) {
                x.pop();
            } else {
                x.push(i);
            }
        }
        StringBuilder temp = new StringBuilder();
        while (!x.empty()) {
            temp.append(x.pop());
        }
        return temp.reverse().toString(); // Reverse to get the correct order
    }

    public int maximumGain(String s, int x, int y) {
        int res = 0;
        String maxStr = (x > y) ? "ab" : "ba";
        String minStr = (x > y) ? "ba" : "ab";
        
        String temp = result(s, maxStr);
        int re = s.length() - temp.length();
        res += (re / 2) * Math.max(x, y);
        
        String temp2 = result(temp, minStr);
        re = temp.length() - temp2.length();
        res += (re / 2) * Math.min(x, y);
        
        return res;
    }
}