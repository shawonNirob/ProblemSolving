
//
class Solution {
    private int count;
    public int countNodes(TreeNode root) {
        count = 0;
        helper(root);
        return count;
    }
    private void helper(TreeNode root){
        if(root==null) return;
        count += 1;
        helper(root.left);
        helper(root.right);
    }
}

//
class Solution {
  public int countNodes(TreeNode root) {
   if(root==null) return 0;
    int left = countNodes(root.left);
    int right = countNodes(root.right);
      
    return left+right+1;
  }
}

//
class Solution {
  public int countNodes(TreeNode root) {
   if(root==null){
       return 0;
   }else{
       return countNodes(root.left) + countNodes(root.right) + 1;
   }
  }
}

//100%, 100%
class Solution {
  public int countNodes(TreeNode root) {
    return root != null ? 1 + countNodes(root.right) + countNodes(root.left) : 0;
  }
}
//
