class Solution {
    public int repeatedNTimes(int[] nums) {
      int ans = 0;
      int count = 1;
      Arrays.sort(nums);
      for(int i=0;i<nums.length-1;i++)
      {
        if(nums[i]==nums[i+1])
        {
            count++;
            ans = nums[i];
        }
      }
     return ans;
    }
}