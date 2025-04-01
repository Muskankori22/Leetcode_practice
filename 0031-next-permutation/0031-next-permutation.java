class Solution {
    public static void reverse(int num[],int start)
    {
        int i = start;
        int j = num.length-1;
        while(i<j)
        {
            swap(num,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int num[],int i,int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i])
        {
            i--;
        }
        if(i>=0)
        {
            int j = nums.length-1;
            while(nums[j] <= nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
}