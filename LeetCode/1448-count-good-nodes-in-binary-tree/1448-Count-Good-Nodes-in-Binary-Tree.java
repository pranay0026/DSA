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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    private int dfs(TreeNode node,int high){
        if(node==null){
            return 0;
        }
        int cc=0;
        if(node.val>=high){
            cc=1;
            high=node.val;
        }
        cc+=dfs(node.left,high);
        cc+=dfs(node.right,high);
        return cc;
    }
}