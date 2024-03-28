class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> c = new HashMap<>();
        int res = 0, i = 0, n = nums.length;
        for (int j = 0; j < n; ++j) {
            c.put(nums[j], c.getOrDefault(nums[j], 0) + 1);
            while (c.get(nums[j]) > k)
                c.put(nums[i], c.get(nums[i++]) - 1);
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}