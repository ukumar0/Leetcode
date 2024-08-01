class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String detail : details) {
        String ageStr = detail.substring(11, 13);
        int age = Integer.parseInt(ageStr);
        if (age > 60) {
            res++;
        }
    }
        return res;
    }
}