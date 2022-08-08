import java.util.Scanner;

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
           // boolean xBool = ttt.xWinCheck(xRow, xCol);
            //boolean oBool = ttt.oWin(oRow, oCol);
            //boolean fBoard = ttt.isBoardFull();
            // boolean fSpace = ttt.fullSpace();


            // X's turn
            System.out.println("X, it's your turn.");
            System.out.println("Which row? ");
            xRow = keyboard.nextInt();
            keyboard.nextLine();
            while (xRow > (ROWSCOLS-1))
            {
                System.out.println("ERROR. Please enter a number "
                        + "between 0 and " + (ROWSCOLS-1) + ".");
                xRow = keyboard.nextInt();
            }
            System.out.println("Which column?");
            xCol = keyboard.nextInt();
            keyboard.nextLine();
            while (xCol > (ROWSCOLS-1))
            {
                System.out.println("ERROR. Please enter a number "
                        + "between 0 and " + (ROWSCOLS-1) + ".");
                xCol = keyboard.nextInt();
            }
            ttt.isBoardFull();
            if (ttt.isBoardFull() == true)
            {
                System.out.println("There are no winners. The game is" +
                        " a tie.");
                ties++;
                System.out.println("Would you like to play again? ('y' for yes)");
                again = keyboard.nextLine();
                break;
            }
            while (ttt.isSpaceFull(xRow, xCol) == true)
            {
                System.out.println("ERROR. This space is already"
                        + " taken. Please choose an empty space.");
                System.out.println("Which row? ");
                xRow = keyboard.nextInt();
                System.out.println("Which column?");
                xCol = keyboard.nextInt();
                break;

            }
            ttt.boardChar("X", xRow, xCol);
            ttt.xWinCheck(xRow, xCol);
            ttt.printBoard();

            if (ttt.xWinCheck(xRow, xCol) == true)
            {
                System.out.println("X is the winner of this game!");
                xWin++;
                System.out.println("Would you like to play again? ('y' for yes)");
                again = keyboard.nextLine();
                break;
            }

            // O's turn
            System.out.println("O, it's your turn.");
            System.out.println("Which row? ");
            oRow = keyboard.nextInt();
            keyboard.nextLine();
            while (oRow > (ROWSCOLS-1))
            {
                System.out.println("ERROR. Please enter a number "
                        + "between 0 and " + (ROWSCOLS-1) + ".");
                oRow = keyboard.nextInt();
            }
            System.out.println("Which column?");
            oCol = keyboard.nextInt();
            keyboard.nextLine();
            while (oCol > (ROWSCOLS-1))
            {
                System.out.println("ERROR. Please enter a number "
                        + "between 0 and " + (ROWSCOLS-1) + ".");
                oCol = keyboard.nextInt();
            }
            ttt.isBoardFull();
            if (ttt.isBoardFull() == true)
            {
                System.out.println("There are no winners. The game is" +
                        " a tie.");
                ties++;
                System.out.println("Would you like to play again? ('y' for yes)");
                again = keyboard.nextLine();
                break;
            }
            while (ttt.isSpaceFull(oRow, oCol) == true)
            {
                System.out.println("ERROR. This space is already"
                        + " taken. Please choose an empty space.");
                System.out.println("Which row? ");
                oRow = keyboard.nextInt();
                System.out.println("Which column?");
                oCol = keyboard.nextInt();
                break;

            }
            ttt.boardChar("O", oRow, oCol);
            ttt.oWinCheck(oRow, oCol);
            ttt.printBoard();

            if (ttt.oWinCheck(oRow, oCol) == true)
            {
                System.out.println("O is the winner of this game!");
                oWin++;
                System.out.println("Would you like to play again? ('y' for yes)");
                again = keyboard.nextLine();
                break;
            }
        } while (again == "y");


        System.out.println("Game Stats:");
        System.out.println("X has won " + xWin + " games.");
        System.out.println("O had won " + oWin + " games.");
        System.out.println("There have been " + ties + " tie games.\n");


        System.out.println("Thanks for playing!"); // goodbye message
        keyboard.close(); // Close scanner
    }
}

