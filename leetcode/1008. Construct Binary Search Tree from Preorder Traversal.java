class Solution {
    private int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = helper(preorder,-1, 1001);
        return root;
    }
    private TreeNode helper(int[] preorder,int min, int max){
        if(index < preorder.length && preorder[index] > min && preorder[index] < max){
            TreeNode root = new TreeNode(preorder[index]);
            index += 1;
        
            root.left = helper(preorder, min, root.val);
            root.right = helper(preorder, root.val, max);
            
            return root;
        }else{
            return null;
        }
    }
}

//


