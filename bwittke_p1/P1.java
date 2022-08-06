package bwittke_p1;

import java.util.Scanner;

/**
 * @author  Bridget Wittke
 * This program simulates a game of tic tac toe between two users.
 * One user places "X" characters on the board and the other places
 * "O" characters. In the "Main" method, the "Tic Tac Toe" class is
 * called to simulate the game. This class allows for multiple sizes
 * of game boards, though in this game the board is a 5X5 square.
 * The user can play this game again as long as they wish.
 *
 * @version 1.0
 */

public class P1 {

    public static void main(String[] args) {
        // Variables
        final int ROWSCOLS = 5;
        int xRow = 0; // row input for "X"
        int xCol = 0; // col input for "X"
        int oRow = 0; // row input for "O"
        int oCol = 0; // row input for "O"
        int xWin = 0; // initialize x wins to 0
        int oWin = 0; // initialize o wins to 0
        int ties = 0; // initialize number of ties to 0
        String again = "y"; // to control the loop

        // New Tic Tac Toe object
        TicTacToe ttt = new TicTacToe(ROWSCOLS);

        // Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Intro message
        System.out.println("Welcome to TicTacToe! To win the game, you must "
                + "\nhave a straight line (either horizontal, vertical, or "
                + "\ndiagonal) of your characters (either 'X' or 'O').\n");
        System.out.println("Ready to play? Hit any key to continue. ");
        keyboard.nextLine();

        // Display board
        ttt.printBoard();

        // do-while loop for play again
        do
        {
            // Booleans for player wins
            boolean xBool = ttt.xWin(xRow, xCol);
            boolean oBool = ttt.oWin(oRow, oCol);
            boolean fBoard = ttt.fullBoard();
            boolean fSpace = ttt.fullSpace();

            // do-while loop for while the booleans "oWin" and
            // "xWin" remain false.
            do
            {
                // X's turn
                System.out.println("X, it's your turn.");
                System.out.println("Which row?");
                xRow = keyboard.nextInt();
                keyboard.nextLine();
                while (xRow > ROWSCOLS)
                {
                    System.out.println("ERROR. Please enter a number "
                            + "between 0 and " + ROWSCOLS + ".");
                }
                System.out.println("Which column?");
                xCol = keyboard.nextInt();
                keyboard.nextLine();
                while (xCol > ROWSCOLS)
                {
                    System.out.println("ERROR. Please enter a number "
                            + "between 0 and " + ROWSCOLS + ".");
                }
                if ( fSpace == true)
                {
                    System.out.println("ERROR. This space is already"
                    + " taken. Please choose an empty space.");
                }
                ttt.boardChar("X", xRow, xCol);
                ttt.printBoard();

                // O's turn
                System.out.println("O, it's your turn.");
                System.out.println("Which row? ");
                oRow = keyboard.nextInt();
                keyboard.nextLine();
                while (oRow > ROWSCOLS)
                {
                    System.out.println("ERROR. Please enter a number "
                            + "between 0 and " + ROWSCOLS + ".");
                }
                System.out.println("Which column? ");
                oCol = keyboard.nextInt();
                keyboard.nextLine();
                while (oCol > ROWSCOLS)
                {
                    System.out.println("ERROR. Please enter a number "
                            + "between 0 and " + ROWSCOLS + ".");
                }
                if (fSpace == true)
                {
                    System.out.println("ERROR. This space is already"
                            + " taken. Please choose an empty space.");
                }
                ttt.boardChar("O", oRow, oCol);
                ttt.printBoard();

            } while (oBool == false && xBool == false
                     && fBoard == false);

            if (oBool == true)
            {
                System.out.println("O is the winner of this game!");
                oWin++;
            }
            else if (xBool == true)
            {
                System.out.println("X is the winner of this game!");
                xWin++;
            }
            else
            {
                System.out.println("There are no winners. The game is" +
                        " a tie.");
                ties++;
            }
            System.out.println("Game Stats:");
            System.out.println("X has won " + xWin + " games.");
            System.out.println("O had won " + oWin + " games.");
            System.out.println("There have been " + ties + " tie games.\n");

            System.out.println("Would you like to play again? ('y' for yes)");
            again = keyboard.nextLine();

        } while (again == "y");

        System.out.println("Thanks for playing!"); // goodbye message
        keyboard.close(); // Close scanner
    }
}
