class Solution {
    int idx;
    int[][] ret;
    
    private void add (int r, int c, int R, int C) {
        if (r >= R || r < 0 || c >= C || c < 0) return;
        ret[idx][0] = r;
        ret[idx++][1] = c;
    }
    
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int r = r0, c = c0, len = 1;
        ret = new int[R * C][2];
        while (idx < (R * C )) {         
            for (int k = 0; k < len; k++) add(r, c++, R, C);          
            for (int k = 0; k < len; k++) add(r++, c, R, C);
            len++;
            for (int k = 0; k < len; k++) add(r, c--, R, C);
            for (int k = 0; k < len; k++) add(r--, c, R, C);
            len++;   
        }
        return ret;
    }
}