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
  // Recursively obtain the height of a tree. An empty tree has -1 height
  private int height(TreeNode root) {
    // An empty tree has height -1
    if (root == null) {
      return -1;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public boolean isBalanced(TreeNode root) {
    // An empty tree satisfies the definition of a balanced tree
    if (root == null) {
      return true;
    }

    // Check if subtrees have height within 1. If they do, check if the
    // subtrees are balanced
    return Math.abs(height(root.left) - height(root.right)) < 2
        && isBalanced(root.left)
        && isBalanced(root.right);
  }
};

