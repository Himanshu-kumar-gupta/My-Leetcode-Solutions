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
    int p=0;//preorder array pointer
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper( 0, inorder.length-1, preorder, inorder);
    }
    public TreeNode helper( int is, int ie, int[] preorder, int[] inorder){
        if(is>ie) return null;//if the subarray from is to ie doesn't exist then the subarray doen't exist
        int j = find(preorder[p], inorder, is, ie);//find the root of the present subtree in inorder array
        TreeNode node = new TreeNode(preorder[p]);//create new node of the sub tree
        p++;//increase the pointer of preorder array
        node.left = helper( is, j-1, preorder, inorder);//build left sub tree
        node.right = helper( j+1, ie, preorder, inorder);//build right sub tree
        return node;
    }
    //find func implemented using Binary Search as it uses O(n) time complexity
    public int find(int val, int[] inorder,int start, int end){
        while(start < end && inorder[start] != val && inorder[end] != val) {
            start++;
            end--;
        }
        return inorder[start] == val ? start : end;
    }
}
