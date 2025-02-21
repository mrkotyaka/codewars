package _5kyu;

public class TicTacToeChecker {
    public static void main(String[] args) {
        System.out.println(isSolved(new int[][]{
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        }));
    }

    public static int isSolved(int[][] board) {
        if (isWin(1, board) == 1) return 1;
        if (isWin(2, board) == 2) return 2;
        return isWin(1, board);
    }

    public static int isWin(int x, int[][] board) {
        if (board[0][0] == x && board[0][1] == x && board[0][2] == x) {
            return x;
        } else if (board[1][0] == x && board[1][1] == x && board[1][2] == x) {
            return x;
        } else if (board[2][0] == x && board[2][1] == x && board[2][2] == x) {
            return x;
        } else if (board[0][0] == x && board[1][0] == x && board[2][0] == x) {
            return x;
        } else if (board[0][1] == x && board[1][1] == x && board[2][1] == x) {
            return x;
        } else if (board[0][2] == x && board[1][2] == x && board[2][2] == x) {
            return x;
        } else if (board[0][0] == x && board[1][1] == x && board[2][2] == x) {
            return x;
        } else if (board[0][2] == x && board[1][1] == x && board[2][0] == x) {
            return x;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
