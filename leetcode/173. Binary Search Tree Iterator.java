//O(N)
class BSTIterator {
    private List<Integer> list;
    private TreeNode root;
    private int index;
    
    public BSTIterator(TreeNode root) {
        this.root = root;
        this.index = 0;
        this.list = new ArrayList();
        this.helper(root);
        
    }
    
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    
    
    public int next(){
        return list.get(index++);
    }
    
    
    public boolean hasNext() {
        if(index == list.size()){
            return false;
        }else{
            return true;
        }
    }
}

//O(H)
class BSTIterator {
    private Stack<TreeNode> stack;;
    
    public BSTIterator(TreeNode root) {
        this.stack = new Stack();
        this.leftMost(root);
    }
    public void leftMost(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
    
    public int next(){
        TreeNode node = stack.pop();
        if(node.right != null){
            leftMost(node.right);
        }
        return node.val;
    }
    
    
    public boolean hasNext() {
        if(!stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

//

