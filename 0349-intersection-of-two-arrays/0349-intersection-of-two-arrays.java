class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    hs.add(nums1[i]);
                    break;
                }
            }
        }
        int arr[] = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
        arr[i++] = num;
        }
        return arr;
    }
}