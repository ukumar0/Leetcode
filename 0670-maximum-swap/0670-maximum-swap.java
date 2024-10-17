class Solution {
    public int maximumSwap(int num) {
        char[] res = Integer.toString(num).toCharArray();
        int n = res.length; 
        int[] last = new int[10]; 
        for (int i = 0; i < n; i++) last[res[i] - '0'] = i;
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > res[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = res[i];
                    res[i] = res[last[d]];
                    res[last[d]] = temp;
                    return Integer.parseInt(new String(res));
                }
            }
        }
    return num;
    }
}