class Solution {
    public int findMaxK(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            for(int i =0;i<nums.length;i++){
                if(nums[j]==-nums[i])
                    largest = Math.max(nums[i],largest);
            }
        }
        return largest == Integer.MIN_VALUE?-1:largest;
    }
}