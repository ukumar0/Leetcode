class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        if(o.length != m*n) return new int[0][0];
	int[][] res = new int[m][n];
	for(int i=0;i<o.length;i++)
		res[i/n][i%n] = o[i];
	return res;
    }
}