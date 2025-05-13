class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],i);
        }
        for(int []op : operations)
        {
            int oldval = op[0];
            int newval = op[1];
            int index = hs.get(oldval);
            nums[index]=newval;
            hs.remove(oldval);
            hs.put(newval,index);
        }
        return nums;
    }
}