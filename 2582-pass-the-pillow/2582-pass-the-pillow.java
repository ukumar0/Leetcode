class Solution {
    public int passThePillow(int n, int time) {
        int s = 1;boolean f=true;
        while(time!=0){if (f) {
            s++;
                if (s == n) f = false;
            } else{s--;
                if (s == 1) f = true;
            }time--;
        }
        return s;
    }
}