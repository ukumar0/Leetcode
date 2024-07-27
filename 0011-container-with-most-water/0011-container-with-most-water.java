class Solution {
    public int maxArea(int[] h) {
        int n = h.length, res = 0, i = 0, j = h.length-1;
        while(i<j){
            int s = Math.min(h[i], h[j]);
            res = Math.max(res, s*(j-i));
            if (h[i] < h[j]) {
                i++;
            } else {
                j--;
            }
        }return res;
    }
}