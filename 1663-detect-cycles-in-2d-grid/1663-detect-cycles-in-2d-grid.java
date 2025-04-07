class Solution {
   int rows, cols;

    public boolean dfs(char[][] grid, int row, int col, int parentRow, int parentCol, boolean[][] visited) {
        visited[row][col] = true;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int[] dir : directions) {
            int x = row + dir[0];
            int y = col + dir[1];

            // Check boundaries
            if (x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] != grid[row][col]) {
                continue;
            }

            if (!visited[x][y]) {
                if (dfs(grid, x, y, row, col, visited)) {
                    return true;
                }
            } else if (x != parentRow || y != parentCol) {
                // If already visited and not coming from parent, it's a cycle
                return true;
            }
        }

        return false;
    }
    public boolean containsCycle(char[][] grid) {
         rows = grid.length;
        cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, i, j, -1, -1, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}