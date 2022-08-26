//For Triplet
package collectionFramework;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class TreeMap_3 {
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
    //x = col, y = row, val = value;
    private void treeCLas(int x, int y, int val){
        if(!map.containsKey(x)){
            map.put(x, new TreeMap<>());
        }
        if(!map.get(x).containsKey(y)){
            map.get(x).put(y, new PriorityQueue<>());
        }
        map.get(x).get(y).add(val);
    }
    private void print(){
        System.out.println(map.entrySet());
    }
    public static void main(String[] args) {
        TreeMap_3 call = new TreeMap_3();
        call.treeCLas(0,0,3);
        call.treeCLas(-1,1,9);
        call.treeCLas(1,1,20);
        call.treeCLas(-2,2,10);
        call.treeCLas(0,2,11);
        call.treeCLas(0,2,15);
        call.treeCLas(2,2,7);

        call.print();
    }
}

//Solution
class Solution {
    public class Triplet{
        TreeNode node;
        int row;
        int col;
        public Triplet(TreeNode node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Triplet> queue = new LinkedList<Triplet>();
        queue.offer(new Triplet(root, 0, 0));
        
        while(!queue.isEmpty()){
            Triplet trio = queue.poll();
            TreeNode node = trio.node;
            int x = trio.col;
            int y = trio.row;
            
            if(!map.containsKey(x)){
                map.put(x, new TreeMap());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue());
            }
            
            map.get(x).get(y).add(node.val);
            
            if(node.left != null){
                queue.add(new Triplet(node.left, y+1, x-1));
            }
            if(node.right != null){
                queue.add(new Triplet(node.right, y+1, x+1));
            }
        }
        List<List<Integer>> list = new ArrayList();
        for(TreeMap<Integer, PriorityQueue<Integer>> map2 : map.values()){
            list.add(new ArrayList());
            for(PriorityQueue<Integer> node : map2.values()){
                while(!node.isEmpty()){
                    list.get(list.size()-1).add(node.poll());
                }
            }
        }
        return list;
    }
}



