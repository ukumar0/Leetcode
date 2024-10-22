/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long[] sums = new long[100000];
    int max = 0;
    private void solve(TreeNode root, int k) {
        if (root == null) return;
        sums[k] += root.val;
        max = Math.max(max, k);

        solve(root.left, k + 1);
        solve(root.right, k + 1);
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        solve(root, 0);
        Long[] s = new Long[max + 1];
        for (int i = 0; i <= max; i++) {
            s[i] = sums[i];
        }
        Arrays.sort(s, Collections.reverseOrder());
        if (k > max + 1) return -1;
        return s[k - 1];
    }
}