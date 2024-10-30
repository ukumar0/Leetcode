class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        int[] lds = new int[n];
        Arrays.fill(lis,1);
        Arrays.fill(lds,1);
        for(int i = 0;i<n;i++){
            for(int j = i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
            }
        }
        for(int i = n-1;i>=0;i--){
            for(int j = i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    lds[i] = Math.max(lds[i],lds[j]+1);
                }
            }
        }
        int r = n;
        for(int i = 0;i<n;i++){
            if(lis[i]>1&&lds[i]>1)r = Math.min(r, n-lis[i]-lds[i]+1);
        }
        return r;
        
    }
}