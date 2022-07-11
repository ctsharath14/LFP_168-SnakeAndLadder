//Ensure the player gets to exact winning position 100.

public class SnakeAndLadder {
     public static void main(String[] args) {
	int startPosition = 0;
        int currentPosition = 0;

        System.out.println("<--------------------Welcome to snake and the ladder games-------------------->");

        System.out.println("Start Position of Player is : " +startPosition);
	do {
	System.out.println("<--------------------------------------------------------->");
            int diceNumber = (int) ((Math.random() * 6) + 1);
            System.out.println("Dice Number is : "+diceNumber);
            int option = (int) ((Math.random() * 3) + 1);

            switch(option){
                case 1: //No Play
                    System.out.println("NO PLAY!! Players stays in same position");
                    break;
                case 2:  //Ladder
                    if((currentPosition+diceNumber) <= 100){
                        currentPosition += diceNumber; 
                    	if(currentPosition == 100){
			System.out.println("Hurray!! Player reaches winning position 100");
                            System.exit(0);
                            }
			else{
                            System.out.println("Player Moves to : "+currentPosition);
                        }
                    }
			else{
                        System.out.println("Current position is greater than 100, hence the chance is skipped");
                    }
                    break;
                case 3: //Snake Bite
                    if((currentPosition - diceNumber) >= 0){
                        currentPosition -= diceNumber;
                        System.out.println("Snake Bites!! Player moves back to : "+currentPosition);
                    	}
		    else{
                        currentPosition = 0;
                        System.out.println("Snake Bite!! Player moves back to starting position");
                    }
                    break;
            }
        }while(currentPosition <= 100);
        }
}