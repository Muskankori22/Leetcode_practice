class Solution {
    public void swap(int nums[],int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
       nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int mid=0;
        int h = nums.length-1;
        int l= 0;
        while(mid <= h)
        {
            if(nums[mid]==0)
            {
              swap(nums,mid,l);
              mid++;
              l++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                swap(nums,mid,h);
                {
                    h--;
                }
            }
        }
    }
}