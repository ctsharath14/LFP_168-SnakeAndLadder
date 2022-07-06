//The Player then checks for a Option. They are No Play, Ladder or Snake.

public class SnakeAndLadder {
	
	public static final int START_POSITION = 0;
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;
	public static final int NO_PLAY = 0;
	
	public static int currentPosition = 0;

	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		System.out.println("Player start Position is: "+START_POSITION);
		
		int diceNumber = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice Number : " +diceNumber);
		
		int option = (int) ((Math.random() * 3) + 1); 
		if (option == IS_SNAKE) {
			currentPosition -= diceNumber;
			System.out.println("Snake bites....");
		} else if (option == IS_LADDER) {
			currentPosition += diceNumber;
			
		} else if (option == NO_PLAY) {
			System.out.println("NO Play");
		}

	}
}