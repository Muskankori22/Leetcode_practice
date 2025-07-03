class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int minlen = 0;
        int  maxlen = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                maxlen = i;
            }
            if(nums[i]<min)
            {
                min = nums[i];
                minlen = i;
            }
        }
        int front = Math.max(minlen,maxlen)+1;
        int back = nums.length-Math.min(minlen,maxlen);
        int mid = Math.min(minlen+1+(nums.length-maxlen),maxlen+1+(nums.length-minlen));

        int res = Math.min(front,back);
        res = Math.min(res,mid);
        return res;
        
    }
}