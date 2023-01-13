class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //not in map = unknown
        //false(0) in map = unsafe
        //true(1) in map = safe
        
        int n = graph.length;
        List<Integer> list =  new ArrayList();
        Map<Integer, Integer> map = new HashMap();
        
        for(int i=0; i<n; i++){
            if(dfs(i, graph, map))
                list.add(i);
        }
        
        return list;
    }
    
    public boolean dfs(int node, int[][] graph, Map<Integer, Integer> map){
        if(map.containsKey(node))
            return map.get(node)==1;
        
        map.put(node, 0);
        
        for(int x : graph[node]){
            if(map.containsKey(x) && map.get(x)==1)
                continue;
            if((map.containsKey(x) && map.get(x)==0) || !dfs(x, graph, map))
                return false;
        }
        
        map.put(node, 1);
        return true;
    }
}

//

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph){
        //0 = unknown
        //1 = unsafe
        //2 = safe
        
        int n = graph.length;
        List<Integer> list = new ArrayList();
        int[] color = new int[n];
        
        for(int i=0; i<n; i++){
            if(dfs(i, graph, color))
                list.add(i);
        }
        
        return list;
    }
    public boolean dfs(int node, int[][] graph, int[] color){
        if(color[node] > 0)
            return color[node]==2;
        
        color[node] = 1;
        
        for(int x : graph[node]){
            if(color[x]==1)
                return false;
            if(color[x]==2)
                continue;
            if(!dfs(x, graph, color))
                return false;
        }
        color[node] = 2;
        return true;
    }
}

//
