//The Player then checks for a Option. They are No Play, Ladder or Snake.

public class SnakeAndLadder {
	public static void main(String[] args) {
		int startPosition = 0;
		int noPlay = 0;
		int isSnake = 1;
		int isLadder = 2;
		int currentPosition = 0;
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		System.out.println("Player start Position is: "+startPosition);
		
		int diceNumber = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice Number : " +diceNumber);
		
		int option = (int) ((Math.random() * 3) + 1); 
		if (option == isSnake) {
			currentPosition -= diceNumber;
			System.out.println("Snake bites....");
		} else if (option == isLadder) {
			currentPosition += diceNumber;
			
		} else if (option == noPlay) {
			System.out.println("NO Play");
		}

	}
}