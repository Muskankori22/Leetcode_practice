class Solution {
    public double dfs(String src,String target,double prod,HashMap<String,HashMap<String,Double>> map,HashSet<String> visited){
        double ret = -1;
        visited.add(src);
        if(map.get(src).containsKey(target))
        {
           ret = map.get(src).get(target)*prod;
        }
        else{
            for(String neighbour:map.get(src).keySet())
            {
                if(!visited.contains(neighbour))
                {
                    ret = dfs(neighbour,target,prod*map.get(src).get(neighbour),map,visited);
                    if(ret!=-1)
                    {
                        break;
                    }
                }
            }
        }
        visited.remove(src);
        return ret;
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
       HashMap<String,HashMap<String,Double>> map = new HashMap<>();
       for(int i=0;i<equations.size();i++)
       {
        String dividend = equations.get(i).get(0);
        String diviser = equations.get(i).get(1);
        double res = values[i];
        if(!map.containsKey(dividend))
        {
            map.put(dividend,new HashMap<String,Double>());
        }
        if(!map.containsKey(diviser))
        {
            map.put(diviser,new HashMap<String,Double>());
        }
        map.get(dividend).put(diviser,res);
        map.get(diviser).put(dividend,1/res);
       } 
       double ans[] = new double[queries.size()];
       for(int i=0;i<queries.size();i++)
       {
        String dividend = queries.get(i).get(0);
        String diviser = queries.get(i).get(1);
        if(!map.containsKey(dividend) || !map.containsKey(diviser))
        {
            ans[i] = -1.0;
        }
        else if(dividend.equals(diviser))
        {
            ans[i]=1.0;
        }
        else{
            HashSet<String> visited = new HashSet<>();
            ans[i] = dfs(dividend,diviser,1,map,visited);
        }
       }
       return ans;
    }
}