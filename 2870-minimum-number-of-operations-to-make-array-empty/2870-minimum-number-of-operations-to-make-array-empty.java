class Solution {
    public int minOperations(int[] v) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int it : v) {
            m.put(it, m.getOrDefault(it, 0) + 1);
        }

        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int frequency = entry.getValue();
            if (frequency < 2) {
                return -1;
            }
            ans += (frequency + 2) / 3;
        }

        return ans;
    }
}