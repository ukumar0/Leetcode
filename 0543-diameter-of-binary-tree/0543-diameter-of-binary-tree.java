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
    int result =Integer.MIN_VALUE; // declaring initially
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return result-1; // since we are just counting the paths not the nodes. Paths will always be #Nodes - 1
    }
    public int solve(TreeNode root){
        if(root == null)return 0; // base condition
        int left = solve(root.left); //hypothetical solution
        int right = solve(root.right); //hypothetical solution
        
        int temp = Math.max(left,right)+1; // to calculate max length for that particular root node
        int ans = Math.max(left+right+1,temp); // to take max for that node or the total sum which will be given to the upper node 
        result = Math.max(result,ans); // taking the max result 
        return temp; // returning to the next upper node this temp value
    }
}