class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count = 0;
        List<Integer> li = new ArrayList<>();
        int ans[] = new int[queries.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                count++;
                li.add(i);
            }
        }
        for(int i=0;i<queries.length;i++)
        {
          if(queries[i]>count){
            ans[i]=-1;
          }
          else 
          {
            ans[i]=li.get(queries[i]-1);
          }
        }
        return ans;
    }
}