class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            hs1.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++)
        {
            hs2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(!hs2.contains(nums1[i]))
            {
                if(!ans1.contains(nums1[i])){
                ans1.add(nums1[i]);
                }
            }
        }
        res.add(ans1);
        for(int i=0;i<nums2.length;i++)
        {
            if(!hs1.contains(nums2[i]))
            {
                if(!ans2.contains(nums2[i]))
                {
                ans2.add(nums2[i]);
                }
            }
        }
        res.add(ans2);
        return res;
    }
}