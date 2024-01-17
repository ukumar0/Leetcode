import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n  = arr.length, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}