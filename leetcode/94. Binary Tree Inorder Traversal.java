
//
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr=curr.left;
            }
            curr= stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
}

//
//Morris Inorder Traverse 
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        TreeNode curr = root;
        TreeNode pre;
        
        while(curr != null){
            if(curr.left == null){
                list.add(curr.val);
                curr = curr.right;
            }else{
                pre = curr.left;
                while(pre.right != null){
                    pre = pre.right;
                }
                pre.right = curr;
                
                TreeNode temp = curr.left;
                curr.left = null;
                curr = temp;
            }
        }
        return list;
    }
}

//
