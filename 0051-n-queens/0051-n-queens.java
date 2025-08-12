class Solution {
    public boolean isSafe(char[][] board, int row, int col, int n) {
        // Check row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // Check column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void NQueen(char[][] board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                NQueen(board, row + 1, n, ans);
                board[row][j] = '.'; // Backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();
        NQueen(board, 0, n, ans);
        return ans;
    }
}
