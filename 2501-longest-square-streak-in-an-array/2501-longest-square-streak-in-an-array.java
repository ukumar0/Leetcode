class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int x : nums){
            int sq = (int)Math.sqrt(x);
            if(sq*sq==x)m.put(x,m.getOrDefault(sq,0)+1);
            else m.put(x,1);
            res = Math.max(res,(int)m.get(x));
        }
        return res<2?-1:res;
    }
}