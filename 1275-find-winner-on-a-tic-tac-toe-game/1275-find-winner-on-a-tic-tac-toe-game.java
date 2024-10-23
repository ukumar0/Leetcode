class Solution {
    public String tictactoe(int[][] moves) {
        int n = 3;
        int dig1 = 0, dig2 = 0;
        int[] row = new int[n];
        int[] col = new int[n];
        for(int i = 0;i<moves.length;i++){
            int r = moves[i][0];
            int c = moves[i][1];
            int val = i%2 == 0? 1 : -1;
            row[r] += val;
            col[c] += val;
            if(r==c)dig1 += val;
            if(r+c == n-1)dig2+=val;
            if(Math.abs(row[r])==n||Math.abs(col[c])==n||Math.abs(dig1)==n||Math.abs(dig2)==n)
                return val==1?"A":"B";
                
        }
        return moves.length==9?"Draw":"Pending";
    }
}