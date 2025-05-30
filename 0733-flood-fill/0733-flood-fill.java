class Solution {
    int rows;
    int cols;
    public void dfs(int row,int col,int color,int currcolor,boolean[][]visited,int[][]image)
    {
        if(row<0 || row>=rows || col<0 || col>=cols)
        {
            return;
        }
        if(image[row][col]!=currcolor)
        {
            return;
        }
        if(visited[row][col])
        {
            return;
        }
        image[row][col] = color;
        visited[row][col] = true;
        int list[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbour[]:list)
        {
            dfs(neighbour[0],neighbour[1],color,currcolor,visited,image);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;
        boolean visited[][] = new boolean[rows][cols];
        dfs(sr,sc,color,image[sr][sc],visited,image);
        return image;
    }
}