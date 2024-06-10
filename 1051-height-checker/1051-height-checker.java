class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        Arrays.sort(heights);
        int res = 0;
        for(int i =0;i<heights.length;i++){
            if(heights[i] != temp[i]) res++;
        }
        return res;
    }
}