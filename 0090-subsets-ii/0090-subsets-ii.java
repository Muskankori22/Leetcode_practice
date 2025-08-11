class Solution {
     public void getAllSubset(int[] nums,List<Integer> ans,int i,List<List<Integer>>     allSubsets){
        Arrays.sort(nums);
        if(i==nums.length)
        {
          allSubsets.add(new ArrayList<>(ans));
          return;  
        }
        ans.add(nums[i]);
        getAllSubset(nums,ans,i+1,allSubsets);
        ans.remove(ans.size()-1);
        int idx = i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1])
        {
            idx++;
        }
         getAllSubset(nums,ans,idx,allSubsets);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        getAllSubset(nums,ans,0,allSubsets);
        return allSubsets; 
    }
}