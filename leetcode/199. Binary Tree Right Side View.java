199. Binary Tree Right Side View

//BFS
class Solution {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(i==size-1) list.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return list;
    }
}

//DFS + Recursive

class Solution {
    List<Integer> list = new ArrayList();
    public List<Integer> rightSideView(TreeNode root){
        if(root==null) return list;
        
        helper(root, 0);
        return list;
    }
    private void helper(TreeNode root, int level){
        if(root==null) return;
        if(level==list.size()) list.add(root.val);
        helper(root.right, level+1);
        helper(root.left, level+1);
    }
}
//
