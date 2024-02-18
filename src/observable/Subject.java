package observable;

import Observer.Players;

public interface Subject {

    void registerObserver(String player);
    void removeObserver(String player);
    void notifyObserver(int numberGuessed);
}
