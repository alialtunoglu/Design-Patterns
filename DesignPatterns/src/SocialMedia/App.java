package SocialMedia;

public class App {

    //Gönderi paylaşabilen sınıflar takip edilebilirdi

    public static void main(String[] args) {
        Sayfa syf1 = new Sayfa();
        Kullanici k1 = new Kullanici("Ahmet");
        Grup g1 = new Grup("Fişek");

        syf1.ekle(k1);
        syf1.ekle(g1);
        syf1.gonderiPaylas("çok güzel bir resim","manzara");
        System.out.println();
        syf1.gonderiPaylas("Kedi resmi","Çok güzel bir kedi");
        k1.ekle(g1);
        k1.gonderiPaylas("Ahmet resmi","profil resmi");

    }

}
