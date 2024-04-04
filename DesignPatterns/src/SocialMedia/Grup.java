package SocialMedia;


//Grup bir takipçidir
public class Grup implements Observer{
    String ad;

    public Grup(String ad) {
        this.ad = ad;
    }

    @Override
    public void update(Gonderi gonderi) {
        System.out.println("Grupa bilgi gönderiyorum"+gonderi.icerik);
    }
}
