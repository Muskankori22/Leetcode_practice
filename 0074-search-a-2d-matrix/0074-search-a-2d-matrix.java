class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int  n= matrix.length;
      int m= matrix[0].length;
      int s = 0;
      int e = n*m-1;
      while(s<=e)
      {
        int mid = (s+e)/2;
        int midele = matrix[mid/m][mid%m];
        if(target==midele)
        {
            return true;
        }
        else if(target<midele)
        {
            e = mid-1;
        }
        else{
            s = mid+1;
        }
      }
      return false;
    }
}