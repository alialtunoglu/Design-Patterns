package Sorular.ObserverSorusu;
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Kullanici implements Observer {
    private String name;
    private String email;

    public Kullanici(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Mail sent to " + email + ": " + message);
    }
}
//Takip Edilen Nesne -> Observer nesnelerine yani gözlemcilere takipçilere bildirim gönderecek nesnemizi ifade eder
interface TakipEdilenNesne {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class Urun implements TakipEdilenNesne {
    private List<Observer> observers = new ArrayList<>();
    private String urunAdi;
    private int fiyat;

    public Urun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Fiyat değişti: " + fiyat);
        }
    }

    public void teklifVer(Kullanici kullanici, int teklif) {
        if (teklif > fiyat) {
            fiyat = teklif;
            //Burada keyıt edilir teklif verildiğinde son fiyatdan yüksekse kullanıcıyı listemize ekleriz
            registerObserver(kullanici);
            notifyObservers(); //ve listedeki tüm kullanıcılara bildirim göndeririz
        } else {
            System.out.println("Teklif, mevcut fiyattan düşük olamaz.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Kullanici sefa = new Kullanici("Sefa Aras", "sefa@ktu.edu");
        Kullanici hakan = new Kullanici("Hakan Bozkurt", "hakan@ktu.edu");

        Urun bilgisayar = new Urun("Bilgisayar", 100);

        System.out.println("1. Teklif");
        bilgisayar.teklifVer(sefa, 50);
        System.out.println("2. Teklif");
        bilgisayar.teklifVer(hakan, 150);
        System.out.println("3. Teklif");
        bilgisayar.teklifVer(sefa, 200);
        System.out.println("4. Teklif");
        bilgisayar.teklifVer(hakan, 250);
    }
}
