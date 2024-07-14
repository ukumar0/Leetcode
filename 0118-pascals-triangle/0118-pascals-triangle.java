class Solution {
    List<Integer> subgen(int n, List<Integer> prevRow) {
        List<Integer> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                g.add(1);
            } else {
                g.add(prevRow.get(i - 1) + prevRow.get(i));
            }
        }
        return g;
    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                l.add(subgen(i, new ArrayList<>()));
            } else {
                l.add(subgen(i, l.get(l.size() - 1)));
            }
        }
        return l;
    }
}