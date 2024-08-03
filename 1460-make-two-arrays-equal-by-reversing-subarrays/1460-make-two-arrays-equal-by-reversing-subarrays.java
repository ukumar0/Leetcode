class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);        int i = 0;
        for(int x: arr){
            if (x == target[i]){i++;continue;}
            else return false;
        }return true;
    }
}