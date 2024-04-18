import java.util.Random;

public class ComputerPlayer {
    private Random random;

    public ComputerPlayer() {
        random = new Random();
    }

    public void makeMove(TicTacToeBoard board) {
        int row, col;
        do {
            row = random.nextInt(TicTacToeBoard.BOARD_SIZE);
            col = random.nextInt(TicTacToeBoard.BOARD_SIZE);
        } while (!board.isCellEmpty(row, col));
        board.makeMove(row, col, 'O');
    }
}
