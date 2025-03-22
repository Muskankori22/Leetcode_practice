class Solution {
    static void dfs(int source,int des,List<List<Integer>> res,List<Integer> curr,boolean[]visit,int[][]graph)
    {
        curr.add(source);
        visit[source] = true;
        if(source==des)
        {
            res.add(new ArrayList<>(curr));
        }
        for(int i:graph[source])
        {
            if(!visit[i])
            {
                dfs(i,des,res,curr,visit,graph);
            }
        }
        visit[source]=false;
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,n-1,res,new ArrayList<>(),visit,graph);
        return res;
    }
}