class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        func(0,nums, new ArrayList<>(), l);
        return l;
    }
    void func(int ind, int[] n, List<Integer> ans, List<List<Integer>> l){
        l.add(new ArrayList<>(ans));
        for(int i = ind;i<n.length;i++){
            if(i>ind&&n[i]==n[i-1])continue;
            ans.add(n[i]);
            func(i+1, n, ans, l);
            ans.remove(ans.size()-1);
        }
    }
}