class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int n = nums.length;

        if (n == 1) return nums[0];

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Check if mid is the answer
            if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
                (mid == n - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }

            // If mid is even
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    // pair is fine, go right
                    s = mid + 2;
                } else {
                    // mismatch, single is on the left
                    e = mid - 1;
                }
            } 
            // If mid is odd
            else {
                if (nums[mid] == nums[mid - 1]) {
                    // pair is fine, go right
                    s = mid + 1;
                } else {
                    // mismatch, single is on the left
                    e = mid - 1;
                }
            }
        }

        return -1; // should never reach here
    }
}
