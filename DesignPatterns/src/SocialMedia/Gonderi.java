package SocialMedia;

//Gonderiyi gözlemliyor
public class Gonderi extends  Observable {
    String resim;
    String icerik;

    public Gonderi(String resim, String icerik) {
        this.resim = resim;
        this.icerik = icerik;
    }
}
