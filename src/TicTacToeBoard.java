public class TicTacToeBoard {
    private char[][] board;
    protected static final int BOARD_SIZE = 3;
    protected static final char EMPTY_CELL = ' ';

    public TicTacToeBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == EMPTY_CELL;
    }

    public boolean isGameOver() {
        // row and col
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] != EMPTY_CELL && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
            if (board[0][i] != EMPTY_CELL && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }

        // diagonal
        if (board[0][0] != EMPTY_CELL && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != EMPTY_CELL && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        // check the board is fulfilled
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }

        // no one win
        return true;
    }

    public void makeMove(int row, int col, char player) {
        board[row][col] = player;
    }
}
