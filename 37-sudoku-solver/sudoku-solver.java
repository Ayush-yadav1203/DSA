class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {

        int row = -1;
        int col = -1;
        boolean empty = true;

        // Find empty cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    empty = false;
                    break;
                }
            }

            if (!empty) {
                break;
            }
        }

        // No empty cell
        if (empty) {
            return true;
        }

        // Try 1 to 9
        for (char num = '1'; num <= '9'; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (solve(board)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {

        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3 x 3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}