class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(x=='[')st.push(x);
            else if(!st.isEmpty())st.pop();
        }
        return (st.size()+1)/2;
    }
}