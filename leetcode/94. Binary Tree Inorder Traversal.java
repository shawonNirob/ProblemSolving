class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }
    public void inOrder(TreeNode root, List<Integer> list){ 
        TreeNode curr = root;
        if(curr!=null){
            inOrder(curr.left, list);
            list.add(curr.val);
            inOrder(curr.right, list);
        }else return;
    }
};

//

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.addFirst(node.val);
            if(node.left != null) stack.add(node.left);
            if(node.right != null) stack.add(node.right);
            
        }
        return list;
    }
}
//

