class Solution {
    public int maxWidthRamp(int[] nums) {
    int res = 0, n = nums.length;
    int[] rightMax = new int[n];
    rightMax[n - 1] = nums[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
    }
    int i = 0, j = 0;
    while (i < n && j < n) {
        if (nums[i] <= rightMax[j]) {
            res = Math.max(res, j - i);
            j++;
        } else {
            i++;
        }
    }
        return res;
    }
}