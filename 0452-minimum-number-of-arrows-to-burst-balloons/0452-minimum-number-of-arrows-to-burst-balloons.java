class Solution {
    public int findMinArrowShots(int[][] points) {
        int arrow = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int lft = 0;
        int rgt = 0;
        for(int i = 0;i<points.length;i++){
            if(i!=0 && (lft <= points[i][1] && rgt >= points[i][0] )){
                continue;
            }
            else{
                lft = points[i][0]; rgt = points[i][1];arrow++;
            }
        }
        return arrow;
    }
}