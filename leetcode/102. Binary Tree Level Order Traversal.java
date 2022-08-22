lass Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root == null) return list;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        
        int level = 0;
        while(!queue.isEmpty()){
            list.add(new ArrayList<Integer>());
                
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                list.get(level).add(node.val);
                
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        return list;
    }
}

//

 */
class Solution {
    private  List<List<Integer>> list;
    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList();
        helper(root, 0);
        
        return list;
    }
    public void helper(TreeNode root, int level){
        if(root==null) return;
        if(list.size() == level)
            list.add(new ArrayList<Integer>());
        list.get(level).add(root.val);
        
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}
//
