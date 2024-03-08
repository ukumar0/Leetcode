class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> um = new HashMap<>();
        for (int x : nums) {
            um.put(x, um.getOrDefault(x, 0) + 1);
        }

        // Step 2: Find Maximum Frequency
        int maxi = 0;
        for (int value : um.values()) {
            maxi = Math.max(maxi, value);
        }

        // Step 3: Calculate Total Frequency with Maximum Frequency
        int ans = 0;
        for (int value : um.values()) {
            if (value == maxi) {
                ans += value;
            }
        }

        // Step 4: Return Result
        return ans;
    }
}