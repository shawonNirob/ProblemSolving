//
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root, p.val, q.val);
    }
    private TreeNode helper(TreeNode root, int p, int q){
        if(root.val == p || root.val == q){
            return root;
        }else if(root.val > p && root.val > q){
            return helper(root.left, p, q);
        }else if(root.val < p && root.val < q){
            return helper(root.right, p, q);
        }else{
            return root;
        }
    }
}

//

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(root.val==p.val || root.val==q.val){
                break;
            }else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else if(root.val < p.val && root.val < q.val){
                root = root.right;
            }else{
                break;
            }
        }
        return root;
    }
}

//

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(root.val==p.val || root.val==q.val){
                return root;
            }else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else if(root.val < p.val && root.val < q.val){
                root = root.right;
            }else{
                return root;
            }
        }
        return null;
    }
}

//

