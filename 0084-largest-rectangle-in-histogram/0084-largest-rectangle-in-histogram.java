class Solution {
    public int largestRectangleArea(int[] h) {
         Stack<Integer> stack = new Stack<>();
        int ma = 0;
        
        for (int i = 0; i <= h.length; i++) {
            while (!stack.isEmpty() && (i == h.length || h[i] < h[stack.peek()])) {
                int height = h[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                ma = Math.max(ma, height * width);
            }
            stack.push(i);
        }
        return ma;
    }
}