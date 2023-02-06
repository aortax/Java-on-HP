public class isValidBST {
    /*Given the root of a binary tree, determine if it is a valid binary search tree (BST).
    
    A valid BST is defined as follows:
    
    The left
    subtree
    of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.
    
    The number of nodes in the tree is in the range [1, 104].
    -231 <= Node.val <= 231 - 1
    https://leetcode.com/problems/validate-binary-search-tree/description/?envType=study-plan&id=level-1
    */
    public boolean isValidBST(TreeNode root) {
        if (root.left.val > root.right.val) {
            return false;
        }
        return isValidBST(root.left);
        return isValidBST(root.right);

    }

    void inOrder(TreeNode node) {
        inOrder(node.left);
        inOrder(node.right);
    }

}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
