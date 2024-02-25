class UnionFind {
    public int[] fa;
    public int[] size;
    public UnionFind(int n) {
        fa = new int[n];
        size = new int[n];
        for (int i = 0; i < n; ++i) {
            fa[i] = i;
            size[i] = 1;
        }
    }
    public int getFa(int i) {
        return i == fa[i] ? i : (fa[i] = getFa(fa[i]));
    }
    public void merge(int i, int j) {
        int fi = getFa(i);
        int fj = getFa(j);
        if (fi == fj) return;
        if (size[fi] > size[fj]) {
            size[fi] += size[fj];
            fa[fj] = fi;
        }
        else {
            size[fj] += size[fi];
            fa[fi] = fj;
        }
    }
}
class Solution {
    public boolean canTraverseAllPairs(int[] a) {
        int n = a.length;
        UnionFind u = new UnionFind(n);
        HashMap<Integer, Integer> fst = new HashMap<>();
        for (int i = 0; i < a.length; ++i) {
            for (int p = 2; p * p <= a[i]; ++p) {
                if (a[i] % p != 0) continue;
                if (fst.containsKey(p)) u.merge(fst.get(p), i);
                else fst.put(p, i);
                while (a[i] % p == 0) a[i] /= p;
            }
            if (a[i] > 1) {
                if (fst.containsKey(a[i])) u.merge(fst.get(a[i]), i);
                else fst.put(a[i], i);
            }
        }
        return u.size[u.getFa(0)] == n;
    }
}