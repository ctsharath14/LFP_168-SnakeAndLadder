//The Player rolls the die to get a number between 1 to 6.

public class SnakeAndLadder {
	public static void main(String[] args) {
		int startPosition = 0;
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		System.out.println("Player start Position is: "+startPosition);
		int diceNumber = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice Number : " +diceNumber);
	}
}