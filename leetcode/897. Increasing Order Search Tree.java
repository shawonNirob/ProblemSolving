class Solution {
    private int size;
    public TreeNode increasingBST(TreeNode root){
        List<Integer> list = new ArrayList();
        helper(root, list);
        size = list.size();
        
        return BST(list, 0);
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
    private TreeNode BST(List<Integer> list, int index){
        if(index==size) return null;
        TreeNode root = new TreeNode(list.get(index));
        index += 1;
        root.right = BST(list, index);
        
        return root;
    }
}

//

class Solution {
    public TreeNode curr;
    public TreeNode increasingBST(TreeNode root){
        TreeNode node = new TreeNode(-1);
        curr = node;
        helper(root);
        return node.right;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        
        root.left = null;
        curr.right = root;
        curr = curr.right;
        
        helper(root.right);
    }
}

//
