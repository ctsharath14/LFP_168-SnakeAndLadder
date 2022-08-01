//Game played between 2 players. If ladder comes then the player plays again. Report who won.

public class SnakeAndLadderUC7 {
    public static void main(String[] args) {
        int playerPosition1 = 0;
        int playerPosition2 = 0;
        int startPosition = 0;
        int winningPosition = 100;
        int dieCount1 = 0;
        int dieCount2 = 0;
        int dieRoll1 = 0;
        int dieRoll2 = 0;
        final int NO_PLAY = 0;
        final int LADDER = 1;
        final int SNAKE = 2;

        System.out.println("Welcome to Snake and the Ladder Game");

        while (playerPosition1 != winningPosition && playerPosition2 != winningPosition) {
            System.out.println("<----------------------------------------------------------------------------------->");
            Player1Chance:
                dieRoll1 = (int) ((Math.random()*6)+1);
                System.out.println("Player1 die number is : "+dieRoll1);
                dieCount1 ++;
                int option1 = (int)(Math.random()*3);

                switch (option1) {
                    case NO_PLAY:
                        System.out.println("It's no play, hence Player1 stays in same position "+playerPosition1);
                        break;

                    case LADDER:
                        playerPosition1 = playerPosition1 + dieRoll1;
                        if (playerPosition1 > 100) {
                            System.out.println("It's a Ladder, Player1 position above hundred and hence stays in same position "+playerPosition1);
                            break;
                        }
                        System.out.println("It's a Ladder, Player1 current position is : "+playerPosition1);
                        break;

                    case SNAKE:
                        playerPosition1 = playerPosition1 - dieRoll1;
                        if (playerPosition1 - dieRoll1 < 0) {
                            playerPosition1 = 0;
                            System.out.println("Snake bites!!, Player1 moves to start position "+playerPosition1);
                        }
                        System.out.println("Snake bites!!, Player1 current position is : "+playerPosition1);
                        break;
                }

            Player2Chance:
                dieRoll2 = (int) ((Math.random()*6)+1);
                System.out.println("Player2 die number is : "+dieRoll2);
                dieCount2 ++;
                int option2 = (int)(Math.random()*3);

                switch (option2) {
                    case NO_PLAY:
                        System.out.println("It's no play, hence Player2 stays in same position "+playerPosition2);
                        break;

                    case LADDER:
                        playerPosition2 = playerPosition2 + dieRoll2;
                        if (playerPosition2 > 100) {
                            System.out.println("It's a Ladder, Player2 position above hundred and hence stays in same position "+playerPosition2);
                            break;
                        }
                        System.out.println("It's a Ladder, Player2 current position is : "+playerPosition2);
                        break;

                    case SNAKE:
                        playerPosition2 = playerPosition2 - dieRoll2;
                        if (playerPosition2 - dieRoll2 < 0) {
                            playerPosition2 = 0;
                            System.out.println("Snake bites!!, Player2 moves to start position "+playerPosition2);
                        }
                        System.out.println("Snake bites!!, Player2 current position is : "+playerPosition2);
                        break;
                }
            }
            System.out.println("<--------------------------------------------------------------------------------------->");
            if (playerPosition1 == winningPosition) {
                System.out.println("Player1 wins the game");
            }
            else {
                System.out.println("Player2 wins the game");
            }
            System.out.println("Number of times die rolled to finish the game was : "+dieCount1);
    }
}
