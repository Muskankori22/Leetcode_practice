class Solution {
    public int findCenter(int[][] edges) {
      HashMap<Integer,Integer> hs = new HashMap<>();
      int edgelength = edges.length;
      for(int i=0;i<edgelength;i++)
      {
        int v1 = edges[i][0];
        int v2 = edges[i][1];
        hs.put(v1,hs.getOrDefault(v1,0)+1);
        hs.put(v2,hs.getOrDefault(v2,0)+1);
         if(hs.get(v1)==edgelength)
         {
            return v1;
         }
         if(hs.get(v2)==edgelength)
         {
            return v2;
         }
      }  
      return -1;
    }
}