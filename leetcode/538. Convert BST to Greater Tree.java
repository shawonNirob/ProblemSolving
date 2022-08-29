class Solution {
    private int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        helper(root);
        return root;
    }
    private void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        sum += root.val;
        root.val = sum;
        helper(root.left);
    }
}

//Morris in-order

