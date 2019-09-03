package TicTacMath;

import java.util.Scanner;

/*
 * This "game launcher" program uses a Tic-Tac-Math board object to deliver
 * most of the game logic; main mostly facilitates the alternation of players
 * and, through the "helper" method makeAPlay(), collecting play information
 * and transmitting it to the board.
 */

class TicTacMath {
    public static void main(String[] args) {
        int currPlayer = 2; // number of current player (either 1 or 2)

        Board gameBoard = new Board();
        System.out.println("Welcome to the Tic Tac Math Game!");
        gameBoard.printBoard();

        while(!gameBoard.hasWinner()) {
            currPlayer = 3 - currPlayer ; // switch players //Fixed
            System.out.println("Player " + currPlayer + "'s turn!");
            makeAPlay(gameBoard);
            gameBoard.printBoard();
        }
        System.out.println("Player " + currPlayer + " wins!");
    }   

    static void makeAPlay(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What value do you want to play? ");
        int value = scanner.nextInt();
        System.out.print("At what position (1-9)? ");
        int position = scanner.nextInt();
        if (board.tryToPlay(value, position))
           	System.out.println("Play successful.");     	
        else
        {
        	System.out.println("Invalid play.Make another move");
        	makeAPlay(board);
        }
        	
    }
}