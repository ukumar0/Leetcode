class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> st = new ArrayList<>();
        List<String> p = new ArrayList<>();
        fun(0,s,p,st);
        return st;
    }
    void fun(int idx, String s, List<String> p, List<List<String>> st){
        if(idx==s.length()){
            st.add(new ArrayList<>(p));
            return;
        }for (int i = idx; i < s.length(); ++i) {
            if (isPalindrome(s.substring(idx, i + 1))) { 
                p.add(s.substring(idx, i + 1));
                fun(i + 1, s, p, st);
                p.remove(p.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}