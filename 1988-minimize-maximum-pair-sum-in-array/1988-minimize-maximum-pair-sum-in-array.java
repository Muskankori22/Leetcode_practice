class Solution {
    public int minPairSum(int[] nums) {
       int max = 0;
       Arrays.sort(nums);
       int s = 0;
       int e = nums.length-1;
       while(s<e)
       {
        int sum = nums[s]+nums[e];
        max = Math.max(sum,max);
        s++;
        e--;
       } 
       return max;
    }
}