package Client;

import Observer.Players;
import observable.Game;

import java.util.Scanner;

public class GuessTheNumberGame {

    private Scanner scanner = new Scanner(System.in);
    public void runApp() {
        System.out.println("Opening Guess the Number Game....");
        startTheGame();
    }

    private void startTheGame() {
        System.out.println("Enter the lower limit: ");
        String lowerLimit=scanner.nextLine().trim();
        System.out.println("Enter the upper limit: ");
        String upperLimit=scanner.nextLine().trim();
        Game game=new Game(lowerLimit,upperLimit);
        System.out.println("The number will be in the range of "+lowerLimit+" to "+upperLimit);
        System.out.println("Enter the player 1 name: ");
        String player1=scanner.nextLine().trim();
        System.out.println("Enter the player 2 name: ");
        String player2=scanner.nextLine().trim();
        Players players1=new Players(player1);
        Players players2=new Players(player2);
        game.registerObserver(players1);
        game.registerObserver(players2);
        game.start();
    }
}
