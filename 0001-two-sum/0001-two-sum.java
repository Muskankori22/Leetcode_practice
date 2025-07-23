class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int res[] = new int[2];
        while(s<nums.length)
        {
           if(s==e)
           {
            s++;
            e = nums.length-1;
           }
           int ans = nums[s]+nums[e];
           if(ans == target)
           {
            res[0] = s;
            res[1] = e;
            return res;
           }
           e--;
        }
        return res;
    }
}