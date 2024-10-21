class Solution {
    public int maxUniqueSplit(String S) {
        return backtrack(S, new HashSet<>());
    }

    private int backtrack(String S, Set<String> s) {
        int count = 0;
        for (int i = 1; i <= S.length(); i++) {
            String substring = S.substring(0, i);
            if (!s.contains(substring)) {
                s.add(substring);
                count = Math.max(count, 1 + backtrack(S.substring(i), s));
                s.remove(substring);
            }
        }
        return count;
    }
}