class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int end = 0;
        int ans = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            ans = Math.max(ans,i+nums[i]);
            if(i==end)
            {
                jumps++;
                end = ans;
            }
        }
        return jumps;
    }
}