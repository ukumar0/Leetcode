class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        for (int x : nums) {
            if (x > 0) {
                n.add(x);
            }
        }
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!n.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}