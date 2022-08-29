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

//Iterator 

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        
        for(int i=1; i< preorder.length; i++){
            TreeNode node = stack.peek();
            TreeNode child = new TreeNode(preorder[i]);
            
            while(!stack.isEmpty() && child.val > stack.peek().val){
                node = stack.pop();
            }
            if(child.val < node.val){
                node.left = child;
            }else{
                node.right = child;
            }
            stack.push(child);
        }
        return root;
    }
}



