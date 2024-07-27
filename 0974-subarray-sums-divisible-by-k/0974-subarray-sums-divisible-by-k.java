class Solution {
    int res = 0;
    public int subarraysDivByK(int[] a, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int s = 0;
        for(int x:a){
            s=(s+x)%k;
            if(s<0)s+=k;
            res+=m.getOrDefault(s,0);
            m.put(s, m.getOrDefault(s,0)+1);
        }return res;
    }
}