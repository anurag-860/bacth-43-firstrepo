import java.util.Random;
import java.util.Scanner;

public class LudoGame {

    static int player1Pos = 0;
    static int player2Pos = 0;
    static final int WIN_POSITION = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎲 Welcome to Basic Ludo Game 🎲");

        while (true) {

            // Player 1 Turn
            System.out.println("\nPlayer 1 - Press Enter to roll dice");
            sc.nextLine();
            int dice = rand.nextInt(6) + 1;
            System.out.println("Player 1 rolled: " + dice);

            if (player1Pos + dice <= WIN_POSITION) {
                player1Pos += dice;
            }

            System.out.println("Player 1 Position: " + player1Pos);

            if (player1Pos == WIN_POSITION) {
                System.out.println("🏆 Player 1 Wins!");
                break;
            }

            // Player 2 Turn
            System.out.println("\nPlayer 2 - Press Enter to roll dice");
            sc.nextLine();
            dice = rand.nextInt(6) + 1;
            System.out.println("Player 2 rolled: " + dice);

            if (player2Pos + dice <= WIN_POSITION) {
                player2Pos += dice;
            }

            System.out.println("Player 2 Position: " + player2Pos);

            if (player2Pos == WIN_POSITION) {
                System.out.println("🏆 Player 2 Wins!");
                break;
            }
        }

        sc.close();
    }
}
