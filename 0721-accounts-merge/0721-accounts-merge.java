class Solution {
    public void dfs(String src,HashSet<String> visited,HashMap<String,List<String>> adjMap, List<String> subList)
    {
        visited.add(src);
        subList.add(src);
        if(!adjMap.containsKey(src))
        {
            return;
        }
        for(String neighbours : adjMap.get(src))
        {
            if(!visited.contains(neighbours))
            {
                dfs(neighbours,visited,adjMap,subList);
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
       HashMap<String,List<String>> adjMap = new HashMap<>();
       for(List<String> account : accounts)
       {
        String firstEmail = account.get(1);
        for(int i=2;i<account.size();i++)
        {
            String email = account.get(i);
            if(!adjMap.containsKey(firstEmail))
            {
                adjMap.put(firstEmail,new ArrayList<>());
            }
            adjMap.get(firstEmail).add(email);

             if(!adjMap.containsKey(email))
            {
                adjMap.put(email,new ArrayList<>());
            }
            adjMap.get(email).add(firstEmail);
        }
       } 
       List<List<String>> res = new ArrayList<>();
       HashSet<String> visited = new HashSet<>();

       for(List<String> account : accounts)
       {
        String firstEmail = account.get(1);
        if(!visited.contains(firstEmail))
        {
            List<String> subList = new ArrayList<>();
            dfs(firstEmail,visited,adjMap,subList);
            Collections.sort(subList);
            subList.add(0,account.get(0));
            res.add(subList);
        }
       }
       return res;
    }
}