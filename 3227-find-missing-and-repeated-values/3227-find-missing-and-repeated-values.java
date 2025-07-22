class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> ls = new ArrayList<>();
        int currectSum = 0;
        int ans[] = new int[2];

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                currectSum = currectSum+grid[i][j];
                if(ls.contains(grid[i][j]))
                {
                  ans[0]=grid[i][j];
                }
                else{
                    ls.add(grid[i][j]);
                }
            }
        }
        currectSum = currectSum-ans[0];
        int n = grid.length;
        int m = grid[0].length;
        int totalSum = (n*m*(n*m+1)/2);
        ans[1] = totalSum-currectSum;
        return ans;
    }
}