class Solution {
    int rows;
    int cols;
    public void dfs(int row,int col,boolean visited[][],char grid[][])
    {
      if(row<0 || row>=rows || col<0 || col>=cols || visited[row][col] || grid[row][col]=='0')
      {
        return;
      }
      visited[row][col] = true;
      int adjList[][] = {
        {row-1,col},{row,col+1},{row+1,col},{row,col-1}
      };
      for(int neigbours[] : adjList)
      {
        dfs(neigbours[0],neigbours[1],visited,grid);
      }

    }
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int island = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    dfs(i,j,visited,grid);
                    island++;
                }
            }
        }
        return island;
    }
}