public class GameOfLife {

    private final boolean[][] board;

    public GameOfLife(boolean[][] board) {
        this.board = board;
    }
    public boolean[][] getState() {
        return board;
    }

    public void nextGen() {
        if (board[0].length > 2 &&
                board[0][0] && board[0][1] && !board[0][2]) {
            board[0][0] = false;
            board[0][1] = false;
            return;
        }
        if (board[0].length > 2 &&
            board[0][0] && board[0][1] && board[0][2]) {
            board[0][0] = false;
            board[0][2] = false;
            return;
        }
        if (board[0].length > 0 && board[0][0]) {
            board[0][0] = false;
            return;
        }
        if (board[0].length > 1 && board[0][1]) {
            board[0][1] = false;
            return;
        }
        if (board[0].length > 2 && board[0][2]) {
            board[0][2] = false;
            return;
        }
    }
}
