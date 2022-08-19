class Solution {
    private boolean ans;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        ans = true;
        heightBalanced(root);
        if(ans) return true;
        
        return false;
    }
    public int heightBalanced(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = heightBalanced(root.left);
        int rightHeight = heightBalanced(root.right);
        
        int heightDiff = Math.abs(leftHeight - rightHeight);
        if(heightDiff > 1) ans = false;
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

//

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int heightDiff = Math.abs(leftHeight -  rightHeight);
        
        return heightDiff < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) +1;
    }
}
