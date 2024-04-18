import java.util.Scanner;

public class HumanPlayer {
    private Scanner scanner;

    public HumanPlayer() {
        scanner = new Scanner(System.in);
    }

    public void makeMove(TicTacToeBoard board) {
        System.out.println("Enter row and col in range [0:2]: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        if (board.isCellEmpty(row, col)) {
            board.makeMove(row, col, 'X');
        } else {
            System.out.println("Cell is filled");
            makeMove(board);
        }
    }
}
