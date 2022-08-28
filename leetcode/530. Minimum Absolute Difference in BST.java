// If the tree is not BST
class Solution {
    private int min = 10001;
    public int getMinimumDifference(TreeNode root) {
        if(root.left != null) helper(root.left, root.val);
        if(root.right != null) helper(root.right, root.val);
        
        if(root.left != null) getMinimumDifference(root.left);
        if(root.right != null) getMinimumDifference(root.right);
        return min;
    }
    private void helper(TreeNode root, int val){
        if(root==null) return;
        min = Math.min(min, Math.abs(root.val - val));
        helper(root.left, val);
        helper(root.right, val);
    }
}

//If this is a BST
class Solution {
    int min = 10001;
    TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }
    private void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(prev != null) min = Math.min(min, Math.abs(root.val - prev.val));
        prev = root;
        helper(root.right);
    }
}
