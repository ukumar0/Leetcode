class Solution {
    public int minChanges(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        for(int i=1; i<arr.length; i+=2)if(arr[i]!=arr[i-1])count++;
        return count;
    }
}