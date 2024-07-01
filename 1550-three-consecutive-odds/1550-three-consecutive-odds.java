class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length, queue = 0, res = 0;
        for(int i =0;i<n;i++){
            if(arr[i]%2!=0){
                queue++;
                if(queue==3) return true;
            }else{
                res = Math.max(res, queue);
                queue = 0;
            }
        }
        if(res>=3)return true;
        else return false;
    }
}