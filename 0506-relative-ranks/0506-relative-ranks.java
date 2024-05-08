import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);

        for (int i = 0; i < score.length; i++) {
            int rank = score.length - Arrays.binarySearch(temp, score[i]);
            if (rank == 1)
                result[i] = "Gold Medal";
            else if (rank == 2)
                result[i] = "Silver Medal";
            else if (rank == 3)
                result[i] = "Bronze Medal";
            else
                result[i] = Integer.toString(rank);
        }
        return result;
    }
}
