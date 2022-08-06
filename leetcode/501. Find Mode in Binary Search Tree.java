class Solution {
    private int maxCount = 1;
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap();
        helper(root, map);
        
        int[] mode = new int[map.size()];
        int index = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) == maxCount){
                mode[index++] = key;
            }
        }
        return Arrays.copyOf(mode, index);
    }
    public void helper(TreeNode root, Map<Integer, Integer> map){
        if(root==null) return;
        if(map.containsKey(root.val)){
            int count = map.get(root.val) + 1;
            maxCount = Math.max(count, maxCount);
            map.put(root.val, count);
        } else{
            map.put(root.val, 1);
        }
        
        helper(root.left, map);
        helper(root.right, map);
    }
}

//

class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap();
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        
        int maxCount = 1;
        while(!stack.isEmpty()){
            root = stack.pop();
            if(map.containsKey(root.val)){
                int count = map.get(root.val) + 1;
                maxCount = Math.max(maxCount, count);
                map.put(root.val, count);
            }else{
                map.put(root.val, 1);
            }
            
            if(root.right != null ) stack.push(root.right);
            if(root.left != null ) stack.push(root.left);
        }
        
        
        int[] mode = new int[map.size()];
        int index = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) == maxCount){
                mode[index++] = key;
            }
        }
        return Arrays.copyOf(mode, index);
    }
}

//

