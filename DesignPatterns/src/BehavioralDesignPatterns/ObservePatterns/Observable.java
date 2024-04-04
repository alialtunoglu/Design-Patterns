package BehavioralDesignPatterns.ObservePatterns;

import java.util.ArrayList;
import java.util.List;

//Gözlenebilir demek burada termometre gözlendiği için observable
public abstract class Observable {

    private List <Observer> observerList;

    public Observable() {
        this.observerList = new ArrayList<>();
    }

    public void ekle(Observer observer){
        observerList.add(observer);
    }
    public void cikar(Observer observer){
        observerList.remove(observer);
    }

    public void haberVer(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
