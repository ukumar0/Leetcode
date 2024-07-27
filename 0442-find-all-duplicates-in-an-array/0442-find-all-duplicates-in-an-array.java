class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> dup = new ArrayList<>();
        for(int x:nums){
            if(!s.add(x))dup.add(x);
        }return dup;
    }
}