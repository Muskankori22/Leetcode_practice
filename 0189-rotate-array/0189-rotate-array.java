class Solution {
    public void rotate(int[] nums, int k) {
      k%= nums.length;
      reverce(nums,0,nums.length-1);
      reverce(nums,0,k-1);
      reverce(nums,k,nums.length-1);
    }
    public static void reverce(int[] nums,int s,int e)
    {
        while(s<e)
        {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}