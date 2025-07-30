class Solution {
    public int maxProduct(int[] nums) {
        int pro = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
           pro = pro*nums[i];
           maxi = Math.max(maxi,pro);
           if(pro==0)
           {
            pro=1;
           }
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--)
        {
           pro*=nums[i];
           maxi = Math.max(maxi,pro);
           if(pro==0)
            pro=1;
        }
        return maxi;
    }
}