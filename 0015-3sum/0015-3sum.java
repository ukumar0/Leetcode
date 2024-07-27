class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)s.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }l.addAll(s);
        return l;
    }
}