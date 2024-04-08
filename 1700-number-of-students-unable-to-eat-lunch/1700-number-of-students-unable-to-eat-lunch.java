class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> s = new Stack<>(); // sandwiches
        ArrayDeque<Integer> q = new ArrayDeque<>(); // students
        
        for (int x : students) {
            q.offer(x);
        }
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            s.push(sandwiches[i]);
        }
        int c =0;
        int n = s.size();
        while (!s.isEmpty()) {
            if (q.peek() == s.peek()) {
                c = 0;
                q.poll();
                s.pop();
            } else {
                c++;
                int temp = q.poll();
                q.offer(temp);
            }
            if (c == q.size()) {
                break;
            }
        }
        return c;
    }
}


