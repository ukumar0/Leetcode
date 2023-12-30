class Solution {
    public boolean makeEqual(String[] words) {
        int[] counter = new int[26];
        for(String w : words){
            for(char ch : w.toCharArray()){
                counter[ch-'a']++;
            }
        }
        for(int i =0;i<26;i++){
            if(counter[i] % words.length !=0){
                return false;
            }
        }
        return true;
    }
}