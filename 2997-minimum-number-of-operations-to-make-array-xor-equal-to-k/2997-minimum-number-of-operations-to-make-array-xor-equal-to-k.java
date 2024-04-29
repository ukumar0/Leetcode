class Solution {
    public int minOperations(int[] nums, int k) {
        int tx = 0;
        for(int x:nums){
            tx ^= x;
        }
        int dif = tx^k;
        return Integer.bitCount(dif);
    }
}