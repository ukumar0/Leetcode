class Solution {
    public int lengthOfLastWord(String s) {
        int sc = 0;
        boolean lc=false;
        for(char c:s.toCharArray()){
            if(c!=' '){
                if(!lc){
                    lc = true;
                    sc=1;
                }else sc++;
            }else{
                lc=false;
            }
        }
        return sc;
    }
}