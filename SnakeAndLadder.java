//Repeat till the Player reaches the winning position 100.

public class SnakeAndLadder {
	public static void main(String[] args) {
		int startPosition = 0;
		int noPlay = 0;
		int isSnake = 1;
		int isLadder = 2;
		int currentPosition = 0;
		System.out.println("<------------------Welcome to Snake And Ladder Game-------------------->");
		System.out.println("Player start Position is: "+startPosition);
	        do {
		System.out.println("<---------------------------------------------------------------------------->");
            	int diceNumber = (int) ((Math.random() * 6) + 1);
            	System.out.println("Dice number after rolling is : " +diceNumber);
            	int option = (int) (Math.random() * 3);
            	switch(option) {
                case 0:
                    System.out.println("NO PLAY!! Players stays at the same position");
                    break;
                case 1:  
                    if((currentPosition+diceNumber) <= 100){
                        currentPosition += diceNumber; 
                    	if(currentPosition == 100){
                            System.out.println("Player reaches winning position 100");
                            System.exit(0);
                            }
			else{
                            System.out.println("Player Moved to position: "+ currentPosition);
                        }
                    }
			else{
                        System.out.println("Die output and current position sum is larger than 100 chance skipped");
                    }
                    break;
                case 2:
                    if((currentPosition - diceNumber) >= 0){
                        currentPosition -= diceNumber;
                        System.out.println("Snake bites!! Player Move Back to position : "+currentPosition);
                    	}
		    else{
                        currentPosition = 0;
                        System.out.println("Snake bites!! Player Moved Again to starting position");
                    }
                    break;
            }
        }while(currentPosition <= 100);

        }
}	
	