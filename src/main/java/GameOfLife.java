public class GameOfLife {

    private boolean[][] board;

    public GameOfLife(boolean[][] board) {
        this.board = board;
    }
    public boolean[][] getState() {
        return board;
    }

    public void nextGen() {
        if(board[0][0]){
            board[0][0] = false;
        }
    }
}
