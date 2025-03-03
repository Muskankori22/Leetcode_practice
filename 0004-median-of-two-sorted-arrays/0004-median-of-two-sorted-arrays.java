class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    int arr[] = new int[n+m];
    int k =0;
    for(int i=0;i<n;i++)
    {
        arr[k++] = nums1[i];
    }
    for(int i=0;i<m;i++)
    {
        arr[k++] = nums2[i];
    }
    Arrays.sort(arr);
    int s = 0;
    int e = arr.length-1;
    double ans = 0;
    while(s<=e)
    {
       ans = arr[s]+arr[e];
       s++;
       e--;
    }
    return ans/2;
    }
}