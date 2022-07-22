class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        preOrder(root, list);
        return list;
        
    }
    public void preOrder(TreeNode root, List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}

//

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            
            if(node.right != null) stack.add(node.right);
            if(node.left != null) stack.add(node.left);
        }
        return list;
    }
}

//Morris preorder Traverse

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        TreeNode curr = root;
        TreeNode pre;
        
        while(root != null){
            if(root.left == null){
                list.add(root.val);
                root = root.right;
            }else{
                pre = root.left;
                while(pre.right != null && pre.right != root){
                    pre = pre.right;
                }
                if(pre.right == root){
                    root = root.right;
                    pre.right = null;
                }else{
                    list.add(root.val);
                    pre.right = root;
                    root = root.left;
                }
            }
        }
        return list;
    }
}
