class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for(int i = 0;i<n-1;i++){
            if(nums[i]==nums[i+1])
                res = nums[i];
        }
        return res;
    }
}