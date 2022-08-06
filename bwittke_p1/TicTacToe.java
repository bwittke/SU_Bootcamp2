package bwittke_p1;

public class TicTacToe {
    private int rowsCols;
    private String gameBoard[][]; // game board size array, set to allow
    // for the user to change the board size.

    /**
     * The constructor builds the empty game board.
     * @param rowCol        the number of rows and columns.
     */

    public TicTacToe(int rowCol) {
        rowsCols = rowCol;
        this.gameBoard = new String[rowCol][rowCol];
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                gameBoard[i][j] = "  ";
            }
        }
        printBoard();
    }

    // This method prints the empty game board
    public void printBoard() {
        for (int row = 0; row < rowsCols; row++) {
            System.out.print("    " + row + "  ");
        }
        System.out.println("");
        for (int row = 0; row < rowsCols; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < rowsCols; col++) {
                System.out.print("  " + gameBoard[row][col] + " | ");
            }
            System.out.println("");
            for (int col = 0; col < rowsCols; col++) {
                System.out.print("--------");
            }
            System.out.println("");

        }
    }

    // This method prints the "X" and "O" characters into
    // the board.

    public String boardChar(String userInput, int row, int col)
    {
        if (userInput == "X") {
            gameBoard[row][col] = "X";
        } else if (userInput == "O") {
            gameBoard[row][col] = "O";
        } else {
            gameBoard[row][col] = " ";
        }
        return gameBoard[row][col];
    }

    // Method to check if the game board is full. No parameters.
    public boolean fullBoard() {
        for (int i = 0; i < rowsCols; i++) {
            for (int j = 0; j < rowsCols; j++) {
                if (gameBoard[i][j] == " ") {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to check if a space is full
    public boolean fullSpace() {
        for (int i = 0; i < rowsCols; i++) {
            for (int j = 0; j < rowsCols; j++) {
                if (gameBoard[i][j] == "X" || gameBoard[i][j] == "O") {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check if X is the winner
    public boolean xWin(int row, int col) {
        // Horizontal win
        for (int i = 0; i < rowsCols; i++) {/*
            for (int j = 0; j < rowsCols; j++) {*/
            if (gameBoard[row][i] != "X") {
                return false;
            }
        }

        // Vertical win
        for (int i = 0; i < rowsCols; i++) {/*
            for (int j = 0; j < rowsCols; j++) {*/
            if (gameBoard[i][col] != "X") {
                return false;
            }
        }

        // Diagonal win
        for (int i = 0; i < rowsCols; i++) {
            for (int j = 0; j < rowsCols; j++) {
                if (gameBoard[i][j] != "X" && gameBoard[i + 1][j + 1] != "X") {
                    return false;
                } else if (gameBoard[i][j] != "X" && gameBoard[i - 1][j - 1] != "X") {
                    return false;
                }
            }
        }
        return true;

    }

    // Method to check if "O" is the winner
    public boolean oWin(int row, int col) {
        // Horizontal win
        for (int i = 0; i < rowsCols; i++) {
            if (gameBoard[row][i] != "O") {
                return false;
            }
        }

        // Vertical win
        for (int i = 0; i < rowsCols; i++)
        {
            if (gameBoard[i][col] != "O")
            {
                return false;
            }
        }

        // Diagonal win
        for (int i = 0; i < rowsCols; i++)
        {
            for (int j = 0; j < rowsCols; j++)
            {
                if (gameBoard[i][j] != "O" && gameBoard[i + 1][j + 1] != "O")
                {
                    return false;
                }
                else if (gameBoard[i][j] != "O" && gameBoard[i - 1][j - 1] != "O")
                {
                    return false;
                }
            }
        }

        return true;

    }

}





