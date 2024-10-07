class Solution {
    public int minLength(String st) {
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<st.length();i++){
            char cur = st.charAt(i);
            if(s.isEmpty()){s.push(cur);continue;}
            if(cur=='B'&&s.peek()=='A')s.pop();
            else if(cur=='D'&&s.peek()=='C')s.pop();
            else s.push(cur);
        }
        return s.size();
    }
}