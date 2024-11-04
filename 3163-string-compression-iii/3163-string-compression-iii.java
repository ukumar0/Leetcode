class Solution {
    public String compressedString(String word) {
        StringBuilder s = new StringBuilder();
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            if (i == word.length() - 1 || word.charAt(i) != word.charAt(i + 1)) {
                while (count > 0) {
                    int n = Math.min(9, count);
                    s.append(n).append(word.charAt(i));
                    count -= n;
                }
                count = 1;
            } else {
                count++;
            }
        }

        return s.toString();
    }
}
