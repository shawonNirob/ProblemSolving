
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        int level=0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList();
            
            if(level%2!=0){
                for(int i = 0; i<n; i++){
                    TreeNode node = q.poll();
                    list.add(node.val);
                    q.add(node);
                }
            }
            
            for(int i=0; i<n; i++){
                TreeNode node = q.poll();
                if(!list.isEmpty()) node.val = list.get(n-i-1);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            level++;
        }
        return root;
    }
}

//

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right, 1);
        return root;
    }
    public void helper(TreeNode root1, TreeNode root2, int level){
        if(root1==null || root2==null) return;
        
        helper(root1.left, root2.right, level+1);
        helper(root1.right, root2.left, level+1);
        
         if(level%2 != 0){
            int temp = root1.val;
            root1.val = root2.val;
            root2.val = temp;
        }
        
    }
}

//
