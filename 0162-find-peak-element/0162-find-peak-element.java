class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==n-1||nums[mid]>nums[mid+1]))
            {
                return mid;
            }
            else if(nums[mid] > nums[mid+1])
            {
                e = mid-1;
            }
            else if(nums[mid]<nums[mid+1])
            {
              s = mid+1;
            }
        }
        return -1;
    }
}