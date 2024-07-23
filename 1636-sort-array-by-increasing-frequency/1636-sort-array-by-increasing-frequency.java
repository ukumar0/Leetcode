class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int a: nums){
            m.put(a, m.getOrDefault(a,0)+1);
        }
        List<Map.Entry<Integer, Integer>> e = new ArrayList<>(m.entrySet());
        e.sort((e1, e2) -> {
            int f = Integer.compare(e1.getValue(), e2.getValue());
            if (f != 0) {
                return f;
            }
            return Integer.compare(e2.getKey(), e1.getKey());
        });
        int[] result = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : e) {
            int num = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result[index++] = num;
            }
        }

        return result;
    }
}