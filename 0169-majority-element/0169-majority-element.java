class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int sol = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == sol) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    sol = nums[i];
                    count = 1;
                }
            }
        }

        return sol;
    }
}
