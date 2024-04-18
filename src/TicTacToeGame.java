public class TicTacToeGame {
    private TicTacToeBoard board;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;
    private RandomNumberGenerator randomNumberGenerator;

    public TicTacToeGame() {
        board = new TicTacToeBoard();
        humanPlayer = new HumanPlayer();
        computerPlayer = new ComputerPlayer();
        randomNumberGenerator = new RandomNumberGenerator();
    }

    public void playGame() {
        board.displayBoard();
        while (!board.isGameOver()) {
            humanPlayer.makeMove(board);
            board.displayBoard();
            if (board.isGameOver()) break;
            computerPlayer.makeMove(board);
            board.displayBoard();
        }
    }

}

