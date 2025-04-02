
public class Node{
    int row;
    int col;
    int time;
    public Node(int r,int c,int t)
    {
        this.row=r;
        this.col=c;
        this.time=t;
    }
}
class Solution {
    private boolean isValidCell(int row,int col,int rows,int cols)
    {
        if(row>=0 && row<rows && col>=0 && col<cols)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<Node> qu = new LinkedList<>();
        int directions[][] = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
        int frorange = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                    qu.add(new Node(i,j,0));
                }
                else if(grid[i][j]==1)
                {
                  frorange++;
                }
            }
        }
        int minTime = 0;
        while(!qu.isEmpty())
        {
            Node node = qu.poll();
            for(int[] direction:directions)
            {
                int newRow = node.row + direction[0];
                int newCol = node.col + direction[1];
                if(isValidCell(newRow,newCol,row,col) && grid[newRow][newCol]==1)
                {
                    qu.add(new Node(newRow,newCol,node.time+1));
                    grid[newRow][newCol]=2;
                    minTime = node.time+1;
                    frorange-=1;
                }
            }
        }
        return frorange==0?minTime:-1;
    }
}