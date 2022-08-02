
//O(N) + O(N)
class Solution {
    public int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        if(root.left !=null) diameterOfBinaryTree(root.left);
        if(root.right != null) diameterOfBinaryTree(root.right);
        
        return diameter;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

//O(N)
class Solution {
    public int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0
        diaBST(root);
        return diameter;
    }
    public int diaBST(TreeNode root){
        if(root == null) return 0;
        
        int leftHeight = diaBST(root.left);
        int rightHeight = diaBST(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        return Math.max(leftHeight, rightHeight)+1;
    }
}

//O(N)

  
