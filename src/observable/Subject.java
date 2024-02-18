package observable;

import Observer.Observers;
import Observer.Players;

public interface Subject {

    void registerObserver(Observers player);
    void removeObserver(Observers player);
    void notifyObserver(int numberGuessed,String  name);
}
