package com.bptn.course.four_in_a_row;

import java.util.Scanner;

public class Game {

	private Player[] players;
	private Board board;
	private static Scanner scanner = new Scanner(System.in);

	public Game(Player[] players, Board board) {
	        // Let's default it two players for now. Later, you can improve upon this to allow the game creator to choose how many players are involved.
	        this.players = players;// complete line.
	        this.board = board;// complete line
	    }

	public void setUpGame() {
		System.out.println("Enter player 1's name: ");
		String playerOneName = scanner.nextLine();
	//	players[0] = new Player(playerOneName "1");
		System.out.println("Enter player 2's name: ");
		String playerTwoName = scanner.nextLine();
		//players[1]= new Player(playerTwoName, "2");
	/**
							 * add logic to prevent a user from giving a second name that's equal to the
							 * first. Allow the user to try as long as the names are not different.
							 */
		
		if(playerTwoName.equals(playerOneName)){
			System.out.println("Error! Both Players cannot have the same name.");
			setUpGame();
		}

		/*
		 * wrap the code in here with a conditional block that enables the check
		 * described above.
		 * 
		 * System.out.println("Error! Both Players cannot have the same name.");
		 * System.out.println("Enter player 2's name: "); playerTwoName =
		 * scanner.nextLine();
		 * 
		 */
	
        // boardSetup();
         //printBoard();
		// set up the board using the appropriate method
		// print the board the using appropriate method
	}

	public void printWinner(Player player) {
		System.out.println(player.getName() + " is the winner");
	}

	public void playerTurn(Player currentPlayer) {
		int col = currentPlayer.makeMove();
		//while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
			// call board method to add token.
		//	board.addToken(col, currentPlayer.getPlayerNumber());
		}
		// print board
		//printBoard();
	//}

	public void play() {
	        boolean noWinner = true;
	        this.setUpGame();
	        int currentPlayerIndex = 0;

	        while (noWinner) {
	            if (board.boardFull()){
	                System.out.println("Board is now full. Game Ends.");
	                return;
	            }

	            Player currentPlayer = players[currentPlayerIndex];
	            
	            
	            // Override default tostring for Player class
	            

	    //public String toString() {
	         //   System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
	            //playerTurn(currentPlayer);
	            //if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
	              //  printWinner(currentPlayer);
	                //noWinner = false;
	            //} else {
	              //  currentPlayerIndex = (currentPlayerIndex + 1) %2;// reassign the variable to allow the game to continue. Note the index would wrap back to the first player if we are at the end. Think of using modulus (%).
	            }
	        }
}


