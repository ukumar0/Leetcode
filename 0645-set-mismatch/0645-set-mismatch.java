class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, miss = -1;
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                miss = i;
            }
        }
        
        return new int[] {dup, miss};
    }
}
