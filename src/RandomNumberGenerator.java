import java.util.Random;

public class RandomNumberGenerator {
    private static final Random random = new Random();

    // choose the first player randomly
    public static char chooseStartingPlayer() {
        int randomInt = random.nextInt(2);
        return (randomInt == 0) ? 'X' : 'O';
    }

    // generate random move for computer
    public static int[] generateRandomMove() {
        int row = random.nextInt(3);
        int col = random.nextInt(3);
        return new int[]{row, col};
    }
}

