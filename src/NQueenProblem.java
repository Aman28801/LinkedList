public class NQueenProblem {
    public void printSolution(int[][] Chessboard)
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(" " + Chessboard[i][j]
                        + " ");
            System.out.println();
        }
    }
    public boolean isSafe(int[][] ChessBoard, int row, int col)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (ChessBoard[row][i] == 1)
                return false;
        for (i=row,j=col;i>=0 && j>=0; i--,j--)
            if (ChessBoard[i][j] == 1)
                return false;
        for (i=row,j=col;j>=0 && i<=0; i++,j--)
            if (ChessBoard[i][j] == 1)
                return false;

        return true;
    }
    public boolean solveNQUtil(int[][] board, int col)
    {
        if (col >= 8)
            return true;
        for (int i = 0; i < 8; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQUtil(board, col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }
    public void solveNQ()
    {
        int[][] board = { {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 },
                {0,0,0,0,0,0,0,0 }};
        if (!solveNQUtil(board, 0)) {
            System.out.print("Solution does not exist");
            return;
        }
        printSolution(board);
    }
    public static void main(String[] args)
    {
        NQueenProblem Queen = new NQueenProblem();
        Queen.solveNQ();
    }
}

