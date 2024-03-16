class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        
        Map<Integer, Integer> sumn = new HashMap<>();
        sumn.put(0, -1);
        int sum = 0, max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sumn.containsKey(sum)) {
                max = Math.max(max, i - sumn.get(sum));
            }
            else {
                sumn.put(sum, i);
            }
        }
        
        return max;
    }
}