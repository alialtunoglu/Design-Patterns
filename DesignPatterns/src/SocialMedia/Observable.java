package SocialMedia;



import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> takipciListesi;

    public Observable() {
        this.takipciListesi = new ArrayList<>();
    }

    public void ekle(Observer observer){
        takipciListesi.add(observer);
    }
    public void cikar(Observer observer){
        takipciListesi.remove(observer);
    }

    public void haberVer(Gonderi gonderi){
        for (Observer observer : takipciListesi) {
            observer.update(gonderi);
        }
    }
}
