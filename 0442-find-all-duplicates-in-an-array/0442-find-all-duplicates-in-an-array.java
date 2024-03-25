class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> dup = new ArrayList<>();
        for(int x:nums){
            if(!set.add(x))
                dup.add(x);
        }
        return dup;
    }
}