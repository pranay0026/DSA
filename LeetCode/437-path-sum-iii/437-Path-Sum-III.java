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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> ps=new HashMap<>();
        ps.put(0L,1);
        return dfs(root,0L,targetSum,ps);
    }
    private int dfs(TreeNode node,long currentSum,int targetSum,HashMap<Long,Integer> ps){
        if(node==null){
            return 0;
        }
        currentSum+=node.val;
        int cc=ps.getOrDefault(currentSum-targetSum,0);
        ps.put(currentSum,ps.getOrDefault(currentSum,0)+1);
        cc+=dfs(node.left,currentSum,targetSum,ps);
        cc+=dfs(node.right,currentSum,targetSum,ps);
        ps.put(currentSum,ps.get(currentSum)-1);
        return cc;
    }
}