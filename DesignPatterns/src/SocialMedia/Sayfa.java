package SocialMedia;

//Sayfa Takip edilen bir sınıftır
public class Sayfa extends Observable implements GonderiPaylasan{
    boolean gonderiPaylasma=false;
    Gonderi gonderi;
    public void gonderiPaylas(String resim,String icerik){
            gonderi = new Gonderi(resim, icerik);
            gonderiPaylasma=true;
            System.out.println(resim+" Resim oluşturuldu");
            gonderiKontrol();
    }
    public void gonderiKontrol(){
        if(gonderi!=null || gonderiPaylasma){
            haberVer(gonderi);
        }
    }
}
