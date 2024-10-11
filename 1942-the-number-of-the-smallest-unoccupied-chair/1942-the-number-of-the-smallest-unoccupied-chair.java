class Solution {
    public int smallestChair(int[][] t, int tf) {
        int ts = t[tf][0];
        Arrays.sort(t, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> av = new PriorityQueue<>();
        for (int i = 0; i < t.length; ++ i) {
            av.offer(i);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for (int i = 0; i < t.length; ++ i) {
            while (!pq.isEmpty() && pq.peek()[0] <= t[i][0]) {
                av.offer(pq.poll()[1]);
            }
            
            if (t[i][0] == ts) {
                break;
            }
            
            pq.offer(new int[]{t[i][1], av.poll()});
        }
        
        return av.peek();
    }
}