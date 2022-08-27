
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        TreeNode rootNode = root;
        while(root != null){
            if(val > root.val){
                if(root.right != null){
                    root = root.right;
                }else{
                    TreeNode node = new TreeNode(val);
                    root.right = node;
                    break;
                }
            }else{
                if(root.left != null){
                    root = root.left;
                }else{
                    TreeNode node = new TreeNode(val);
                    root.left = node;
                    break;
                }
            }
        }
        return rootNode;
    }
}
//

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        while(root != null){
            if(val > root.val){
                if(root.right != null){
                    root = root.right;
                }else{
                    root.right = new TreeNode(val);
                    return node;
                }
            }else{
                if(root.left != null){
                    root = root.left;
                }else{
                    root.left = new TreeNode(val);
                    return node;
                }
            }
        }
        return new TreeNode(val);
    }
}

//
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        if(val > root.val){
            root.right = insertIntoBST(root.right, val);
            return root;
        }else{
            root.left = insertIntoBST(root.left, val);
            return root;
        }
    }
}
//
