//Report the number of times the dice was played to win the game and also the position after every die role

public class SnakeAndLadder {
	
	public static final int START_POSITION = 0;
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;
	public static final int NO_PLAY = 0;

	public static int currentPosition = 0;
	public static int totalDiceRolls = 0;


	public static void playerPositionMoves() {
		while (currentPosition < 100) {
			
			System.out.println("<--------------------------------------------->");
			int diceNumber = (int) ((Math.random() * 6) + 1);
			System.out.println("Dice Number : " + diceNumber);

			int option = (int) ((Math.random() * 3) + 1);
			if (option == IS_SNAKE) {
				currentPosition -= diceNumber;
				System.out.println("Snake bites....");
			} else if (option == IS_LADDER) {
				currentPosition += diceNumber;
				
			} else if (option == NO_PLAY) {
				System.out.println("NO Play");
			}

			if (currentPosition < START_POSITION) { 
				currentPosition = START_POSITION;
			} else if (currentPosition > 100) {
				currentPosition -= diceNumber;
			}
			totalDiceRolls++;
			System.out.println("Player moves position: " + currentPosition);
		}
	}



	public static void playUntilWin() { 
		while (currentPosition != 100) {
			playerPositionMoves();
		}
	}

	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		playUntilWin();
		System.out.println("<--------------------------------------------->");
		System.out.println("Player has won");
		System.out.println("Total dice roll: " + totalDiceRolls);
	}
}
