class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        String path;
        preorder(root, list,"");
        
        return list;
    }
    public void preorder(TreeNode root,List<String> list, String path){
        if(root==null) return;
        path += String.valueOf(root.val);
        if(root.left!=null || root.right!=null) path += "->";
        
        if(root.left==null && root.right==null) list.add(path);
        
        if(root.left!=null) preorder(root.left, list, path);
        if(root.right!=null) preorder(root.right, list, path);
    }
}

//

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        Deque<Pair<TreeNode, String>> stack = new ArrayDeque();
        stack.push(new Pair(root, ""));
        String path = "";
        
        while(!stack.isEmpty()){
            Pair<TreeNode, String> curr = stack.pop();
            root = curr.getKey();
            path = curr.getValue();
            
            path += String.valueOf(root.val);
            if(root.left==null && root.right==null){
                list.add(path);

            }else{
                path += "->";
            }
            
            if(root.right!=null) stack.push(new Pair(root.right, path));
            if(root.left!=null) stack.push(new Pair(root.left, path));
        }
        return list;
    }
}

