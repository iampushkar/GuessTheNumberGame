package Observer;

import java.util.List;

public class Players implements Observers{

    private String name;
    public Players(String name) {
        this.name=name;
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(int winningNumber, int guessedNumber,String playerName) {

        if(name.equals(playerName))
        {
            if(winningNumber==guessedNumber){
                System.out.println("Congratulation! "+name+" , You got the number :)");
            }else if (winningNumber<guessedNumber)
            {
                System.out.println("Try again! "+name+" your guessed number is greater than the winning number");
            }else {
                System.out.println("Try again! "+name+" your guessed number is lesser than the winning number");
            }
        }else{
            if(winningNumber!=guessedNumber){
                System.out.println(name+" now your try!");
            }else{
                System.out.println(name+" better luck next time!");
            }
        }
    }
}
