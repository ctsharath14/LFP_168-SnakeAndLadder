//The Player rolls the die to get a number between 1 to 6.

public class SnakeAndLadder {
	
	public static final int START_POSITION = 0;


	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		System.out.println("Player start Position is: "+START_POSITION);
		int diceNumber = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice Number : " +diceNumber);
	}
}