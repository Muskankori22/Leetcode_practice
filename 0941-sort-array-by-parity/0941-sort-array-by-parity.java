class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s<e)
        {
            if(nums[s]%2!=0 && nums[e]%2==0)
            {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
            else if(nums[s]%2==0 && nums[e]%2!=0)
           { s++;
            e--;
            }
            else if(nums[s]%2==0 && nums[e]%2==0)
            {
                s++;
            }
            else if(nums[s]%2!=0 && nums[e]%2!=0)
            {
                e--;
            }
        }
        return nums;
    }
}