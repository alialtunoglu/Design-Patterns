package SocialMedia;



//Kullanıcı takip edilen bir sınıftır ve aynı zamanda bir takipçidir
public class Kullanici extends Observable implements Observer,GonderiPaylasan {
    String adi;
    Gonderi gonderi;
    boolean gonderiPaylasma;
    public Kullanici(String adi) {
        this.adi = adi;
    }

    public void gonderiPaylas(String resim,String icerik){
        gonderi = new Gonderi(resim, icerik);
        gonderiPaylasma=true;
        System.out.println(resim+"Resim oluşturuldu");
        gonderiKontrol();
    }
    public void gonderiKontrol(){
        if(gonderi!=null || gonderiPaylasma){
            haberVer(gonderi);
        }
    }
    @Override
    public void update(Gonderi gonderi) {
        System.out.println("kullanıcı takip ettiğin biri  gönderi paylaştı"+gonderi.icerik);
    }
}
