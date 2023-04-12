public class validBST {

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
    
    TreeNode prev;
    
    public boolean isValidBST(TreeNode root) {
        prev = null;
        return inOrderTranversal(root);
    }

    public boolean inOrderTranversal(TreeNode root)
    {
        if (root == null) {
            return true;
        }

        // Going to tranverse the left subtree
        if (!inOrderTranversal(root.left)) {
            return false;
        }

        // Check if now the current node value is greater than previous ones

        if (prev != null && root.val <= prev.val) {
            return false;
        }

        // Now update our previous node to current value

        prev = root;

        // Tranverse the right subtree
        return inOrderTranversal(root.right);
    }
    public static void main(String[] args) {
        TreeNode validBST = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(7, new TreeNode(6), new TreeNode(8))); 
    }
}
