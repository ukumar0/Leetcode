class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length,count = 0;
        for(int i = 0;i<n;i++){
            int res = 0;
            for(int j = i;j<n;j++){
                res +=nums[j];
                if(res==goal)
                    count++;
            }
        }
        return count;
    }
}