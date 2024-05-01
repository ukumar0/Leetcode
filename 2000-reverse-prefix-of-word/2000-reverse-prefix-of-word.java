class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuffer temp = new StringBuffer();
        int i =0;
        for(char x:word.toCharArray()){
            temp.append(x);
            if(x==ch&&i==0){
                temp.reverse();
                i++;
            }
        }
        return temp.toString();
    }
}