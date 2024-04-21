class Solution {
    private boolean found = false;
    public boolean validPath(int n, int[][] e, int start, int end) {
       if(start == end) return  true;
        
        Map<Integer,List<Integer>> graph = new HashMap();
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
        for(int[] edge : e){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }
		//start dfs from start point
        dfs(graph,visited,start,end);
        return found;
    }
    
    private void dfs(Map<Integer,List<Integer>> graph,boolean[] visited, int start, int end){
        if(visited[start] || found) return;
        visited[start] = true;
        for(int n : graph.get(start)){
            if(n == end){
                found = true;
                break;
            }
            if(!visited[n])
                dfs(graph, visited, n, end);
        }
    }
}