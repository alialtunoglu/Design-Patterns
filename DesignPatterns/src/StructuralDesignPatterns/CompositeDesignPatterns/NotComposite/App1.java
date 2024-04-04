package StructuralDesignPatterns.CompositeDesignPatterns.NotComposite;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {
        Urun domates = new Urun ("Domates", BigDecimal.TEN);
        Urun patates = new Urun ("Patates", BigDecimal.ONE);
        Urun sogan = new Urun ("Soğan", BigDecimal.ONE);

        Paket sebzePaketi = new Paket ("Sebze Paketi");
        sebzePaketi.getUrunList().add(domates);
        sebzePaketi.getUrunList().add(patates);
        sebzePaketi.getUrunList().add(sogan);

        Urun sesSistemi = new Urun( "Ses Sistemi",BigDecimal.valueOf(5000));
        Urun kulaklik = new Urun( "Kulaklık",BigDecimal.valueOf(1000));

        Paket teknolojiPaketi = new Paket("Teknoloji Paketi");
        teknolojiPaketi.getUrunList().add(sesSistemi);
        teknolojiPaketi.getUrunList().add(kulaklik);


        Urun futbolTopu = new Urun("Futbol Topu",BigDecimal.valueOf(100));
        Sepet sepet = new Sepet("Benim sepetim");

        sepet.getPaketList().add(sebzePaketi);
        sepet.getPaketList().add(teknolojiPaketi);
        sepet.getUrunList().add(futbolTopu);

        BigDecimal toplamTutar = sepet.getToplamTutar();
        System.out.println("Ödenecek Tutar = "+ toplamTutar + "Tl");
    }
}
