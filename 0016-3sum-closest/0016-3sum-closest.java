class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int closest_sum = Integer.MAX_VALUE/2; 
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            for(int k=j+1;k<nums.length;k++)
            {
                int curr_sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(curr_sum-target) < Math.abs(closest_sum-target))
                {
                    closest_sum =curr_sum;
                }
            }
        }
       }
       return closest_sum;
    }
}