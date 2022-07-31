class Solution {
    public Integer prev = null;
    
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
    public boolean inorder(TreeNode root){
        if(root==null) return true;
        
        if(!inorder(root.left)) return false;
        
        if(prev != null && root.val <= prev) return false;
        
        prev = root.val;
        return inorder(root.right);
    }
}

//

class Solution {
    public Integer prev = null;
    public boolean isValidBST(TreeNode root) {
       Stack<TreeNode> stack = new Stack();
       TreeNode curr = root;
        
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(prev != null && curr.val <= prev) return false;
            
            prev = curr.val;
            curr = curr.right;
        }
        return true;
    }
}


