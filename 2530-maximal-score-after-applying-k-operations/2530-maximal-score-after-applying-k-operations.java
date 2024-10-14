class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int x: nums)pq.offer(x);
        long score = 0;
        while(k>0){
            score+=pq.peek();
            int x =(int)Math.ceil(pq.poll()/3.0);
            pq.offer(x);
            k--;
            
        }
        return score;
    }
}