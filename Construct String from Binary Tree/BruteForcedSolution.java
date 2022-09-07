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
    StringBuilder res1=new StringBuilder();
    public String tree2str(TreeNode root) {
        preOrder(root);
        String res=res1.toString();
        res=res.replace("()","");
        res=res.replace("LR(","()(");
        res=res.replace("L","");
        res=res.replace("R","");
        res=res.substring(1,res.length()-1);
        return res;
    }
    
    public void preOrder(TreeNode root) {
        if(root==null) {
            res1.append("()");
            return;
        }            
        
        res1.append("("+Integer.valueOf(root.val));
        res1.append("L");
        preOrder(root.left);
        res1.append("R");
        preOrder(root.right);
        res1.append(")");
    }
}
