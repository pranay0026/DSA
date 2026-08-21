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
    public int maxLevelSum(TreeNode root) {
        int maxLevel=1;
        int currLevel=1;
        Queue<TreeNode> qu=new LinkedList<>();
        int maxSum=Integer.MIN_VALUE;
        qu.offer(root);
        while(!qu.isEmpty()){
            int levelSize=qu.size();
            int currLevelSum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode node=qu.poll();
                currLevelSum+=node.val;
                if(node.left!=null){
                    qu.offer(node.left);
                }
                if(node.right!=null){
                    qu.offer(node.right);
                }
            }
            if(currLevelSum>maxSum){
                maxSum=currLevelSum;
                maxLevel=currLevel;
            }
            currLevel++;
        }
        return maxLevel;
    }
}