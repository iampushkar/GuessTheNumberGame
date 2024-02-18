package observable;

import Observer.Observers;
import Observer.Players;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game implements Subject{

    private Scanner scanner = new Scanner(System.in);
    private List<Observers> players=new ArrayList<>();
    private int winningNumber;
    private String lowerLimit;
    private String upperLimit;
    private Boolean gameOver=false;
    public Game(String lowerLimit, String upperLimit) {
        this.lowerLimit=lowerLimit;
        this.upperLimit=upperLimit;
        generateRandomNumber(lowerLimit,upperLimit);
    }

    private void generateRandomNumber(String lowerLimit, String upperLimit) {
        int l=Integer.parseInt(lowerLimit);
        int h=Integer.parseInt(upperLimit);
        Random random=new Random();
        winningNumber=random.nextInt(h-l+1)+l;
        System.out.println(winningNumber);
    }

    @Override
    public void registerObserver(Observers player) {
        players.add(player);
    }

    @Override
    public void removeObserver(Observers player) {
        players.remove(player);
    }

    @Override
    public void notifyObserver(int numberGuessed,String name) {
        for(Observers observers:players)
        {
            observers.update(winningNumber,numberGuessed,name);
        }
    }

    public void start() {
        while (!gameOver)
        {
            for(Observers player:players)
            {
                if(player instanceof Players){
                    Players name=(Players) player;
                    System.out.println("Enter the guess: "+name.getName());
                    String guess=scanner.nextLine().trim();
                    if (winningNumber==Integer.parseInt(guess)){
                        gameOver=true;
                        notifyObserver(Integer.parseInt(guess),name.getName());
                        break;
                    }else{
                        notifyObserver(Integer.parseInt(guess),name.getName());
                    }
                }
            }
        }
    }
}
