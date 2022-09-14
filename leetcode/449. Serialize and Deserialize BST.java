//1. Preorder with array
public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    int index;
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        index = 0;
        return createTree(arr, -1, 10001);
    }
    public TreeNode createTree(String[] arr, int min, int max){
        if(index < arr.length && min < Integer.valueOf(arr[index]) && max > Integer.valueOf(arr[index])){
            TreeNode root = new TreeNode(Integer.valueOf(arr[index++]));
            
            root.left = createTree(arr, min, root.val);
            root.right = createTree(arr, root.val, max);
            
            return root;
        }else{           
            return null;
        }
    }
}



//2. Preorder with list
public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        List<String> list = new LikedList<String>(Arrays.asList(arr));
        return createTree(list, -1, 10001);
    }
    public TreeNode createTree(List<String> list, int min, int max){
        if(!list.isEmpty() && min < Integer.valueOf(list.get(0)) && max > Integer.valueOf(list.get(0))){
            TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
            
            list.remove(0);
            root.left = createTree(list, min, root.val);
            root.right = createTree(list, root.val, max);
            
            return root;
        }else{           
            return null;
        }
    }
}

//3. preorder with ArrayDeque
public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        Deque<Integer> deque = new ArrayDeque();
        for(String s: data.split(",")){
            deque.add(Integer.parseInt(s));
        }
        return createTree(deque, -1, 10001);
    }
    public TreeNode createTree(Deque<Integer> deque, int min, int max){
        if(!deque.isEmpty() && min < deque.getFirst()  && max >deque.getFirst() ){
            TreeNode root = new TreeNode(deque.getFirst());
            
            deque.removeFirst();
            root.left = createTree(deque, min, root.val);
            root.right = createTree(deque, root.val, max);
            
            return root;
        }else{           
            return null;
        }
    }
}


//4. postorder with list;
public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        helper(root.right);
        ser += String.valueOf(root.val) + ",";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        return createTree(list, -1, 10001);
    }
    public TreeNode createTree(List<String> list, int min, int max){
        if(!list.isEmpty() && min < Integer.valueOf(list.get(list.size()-1)) && max > Integer.valueOf(list.get(list.size()-1))){
            TreeNode root = new TreeNode(Integer.valueOf(list.get(list.size()-1)));
            
            list.remove(list.size()-1);
            root.right = createTree(list, root.val, max);
            root.left = createTree(list, min, root.val);
            
            return root;
        }else{           
            return null;
        }
    }
}

//5. Postorder with ArrayDeque
public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        helper(root.right);
        ser += String.valueOf(root.val) + ",";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        Deque<Integer> deque = new ArrayDeque();
        for(String s: data.split(",")){
            deque.add(Integer.parseInt(s));
        }
        return createTree(deque, -1, 10001);
    }
    public TreeNode createTree(Deque<Integer> deque, int min, int max){
        if(!deque.isEmpty() && min < deque.getLast()  && max >deque.getLast() ){
            TreeNode root = new TreeNode(deque.getLast());
            
            deque.removeLast();
            root.right = createTree(deque, root.val, max);
            root.left = createTree(deque, min, root.val);
            
            return root;
        }else{           
            return null;
        }
    }
}

