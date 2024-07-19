class Solution {
    public int findDuplicate(int[] nums) {
    int n = nums.length;
    for(int i=0;i<n;i++) nums[i]--;
        int slow = n-1;
        int fast = n-1;
    do{
        slow = nums[slow];
        fast = nums[nums[fast]];
    }while(slow != fast);
        slow = n-1;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
    return slow+1;
    }
}