class Solution {
    public int minimumPushes(String word) {
        int[] f = new int[26];
        for (char c : word.toCharArray()) {
            f[c - 'a']++;
        }Integer[] sortf = new Integer[26];
        for (int i = 0; i < 26; i++) {
            sortf[i] = f[i];
        }Arrays.sort(sortf, Collections.reverseOrder());
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (sortf[i] == 0) break;
            res += (i / 8 + 1) * sortf[i];
        }return res;
    } 
}