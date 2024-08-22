class Solution {
    public int findComplement(int n) {
        int i = 0, j = 0;
        while (i < n){
            i += Math.pow(2, j);
            j++;
        }return i - n;
    }
}