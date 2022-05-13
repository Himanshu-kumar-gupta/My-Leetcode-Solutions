/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        if (root.left != null && root.right != null) {
            root.left.next = root.right;
            root.right.next = getNextHasChildrenNode(root);
        }

        if (root.left == null) {
            root.right.next = getNextHasChildrenNode(root);
        }

        if (root.right == null) {
            root.left.next = getNextHasChildrenNode(root);
        }

        // right should first
        root.right = connect(root.right);
        root.left = connect(root.left);

        return root;
    }
    
     public Node getNextHasChildrenNode(Node root) {
        while (root.next != null) {
            if (root.next.left != null) {
                return root.next.left;
            }
            if (root.next.right != null) {
                return root.next.right;
            }

            root = root.next;
        }

        return null;
     }
}
