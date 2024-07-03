class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n<=3) return 0;
        Arrays.sort(nums);
        int r = Integer.MAX_VALUE;
        for(int i =0;i<4;i++){
            r = Math.min(r,nums[n-4+i]-nums[i]);
        }
        return r;
    }
}