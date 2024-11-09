class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        Arrays.sort(c);
        List<List<Integer>> l = new ArrayList<>();
        fun(0,0,c,target,l,new ArrayList<>());
        return l;
    }
    void fun(int ind, int sum, int[] c, int t, List<List<Integer>> l, List<Integer> r){
        if(sum>t)return;
        if(sum==t){
            l.add(new ArrayList<>(r));
            return;
        }
        for(int i = ind;i<c.length;i++){
            r.add(c[i]);
            fun(i, sum + c[i], c , t, l, r);
        
            r.remove(r.size()-1);
        }
    }
}