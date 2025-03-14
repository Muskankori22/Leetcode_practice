class Solution {
    public int search(int[] nums, int target) {
     int ans = -1;
     int s = 0;
     int e = nums.length-1;
     while(s<=e)
     {
        int mid = (s+e)/2;
        if(nums[mid] == target)
        {
            return mid;
        }
        if(nums[mid] <= nums[e])
        {
            if(target >= nums[mid] && target <= nums[e])
            {
                s = mid+1;
            }
            else 
            {
                e = mid-1;
            }
        }
        else{
            if(target >= nums[s] && target <= nums[mid])
            {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
     }
     return ans;
    }
}