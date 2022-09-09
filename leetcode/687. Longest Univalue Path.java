class Solution{
    private int path =0 ;
    public int longestUnivaluePath(TreeNode root){
        if(root==null) return 0;
        length(root, root.val);
        return path;
    }
    public int length(TreeNode root, int val){
        if(root==null) return 0;
        int left = length(root.left, root.val);
        int right = length(root.right, root.val);
        path = Math.max(path, left+right);
        if(val == root.val) return Math.max(left, right) + 1;
        return 0;
    } 
}

//

class Solution {
    private int path;
    public int longestUnivaluePath(TreeNode root) {
        path = 0;
        helper(root);
        
        return path;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int leftVar=0, rightVar=0;
        if(root.left != null && root.left.val == root.val){
            leftVar += left;
        }
        if(root.right != null && root.right.val == root.val){
            rightVar += right;
        }
        
        path = Math.max(path, leftVar+rightVar);
        return Math.max(leftVar, rightVar) +1;
    }
}

//
