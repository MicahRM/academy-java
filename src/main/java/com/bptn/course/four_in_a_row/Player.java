package com.bptn.course.four_in_a_row;

import java.util.Scanner;

public class Player {
	
	
	 private String name;
	 private int playerNumber;
	    // Add other instance variable(s)

	    // Question: should scanner be static or not?
	    private static Scanner scanner = new Scanner(System.in);// complete line

	    public Player(String name, int playerNumber) {
			this.name = name;
			this.playerNumber = playerNumber;
		}

		

	    // create getter methods

	    String getName() {
			return name;
		}



		void setName(String name) {
			this.name = name;
		}



		int getPlayerNumber() {
			return playerNumber;
		}



		void setPlayerNumber(int playerNumber) {
			this.playerNumber = playerNumber;
		}



		static Scanner getScanner() {
			return scanner;
		}



		static void setScanner(Scanner scanner) {
			Player.scanner = scanner;
		}



		public int makeMove() {
	        System.out.println("Make your move. What column do you want to put a token in?");
	        int column = scanner.nextInt();// receive user input
	        return column;
	    }

	    public String toString() {
	        return ("Player " + playerNumber + " is " + name);
	    }
	}


