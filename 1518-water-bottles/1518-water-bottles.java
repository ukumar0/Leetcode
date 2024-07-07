class Solution {
//     int count(int n){
        
//     }
public int numWaterBottles(int numbo, int numex) {
    int sum = numbo;
    int empty = numbo;
    while(empty >= numex){
        int newBottles = empty / numex;
        sum += newBottles;
        empty = newBottles + (empty % numex);
    }
    return sum;
}
}