class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int start = 0;
      int currgas = 0;
      int togas = 0;
      int tocost = 0;
      for(int i=0;i<gas.length;i++)
      {
        togas+=gas[i];
        tocost += cost[i];
      }
      if(togas < tocost)
      {
        return -1;
      }
      for(int i=0;i<gas.length;i++)
      {
        currgas+=gas[i]-cost[i];
        if(currgas < 0)
        {
            start = i+1;
            currgas = 0;

        }
      }
      return start;
    }
}