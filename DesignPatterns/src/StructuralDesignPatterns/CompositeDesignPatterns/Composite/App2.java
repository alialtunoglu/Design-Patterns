package StructuralDesignPatterns.CompositeDesignPatterns.Composite;

import java.math.BigDecimal;

public class App2 {
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

        Urun yag = new Urun("Yağ",BigDecimal.valueOf(50));

        Kumanya kumanya = new Kumanya("Ramazan Kumanyası");
        kumanya.getPaketList().add(sebzePaketi);
        kumanya.getUrunList().add(yag);

        Sepet sepet = new Sepet("Benim sepetim");
        sepet.getFiyatlanabilirList().add(sebzePaketi);
        sepet.getFiyatlanabilirList().add(teknolojiPaketi);
        sepet.getFiyatlanabilirList().add(futbolTopu);
        sepet.getFiyatlanabilirList().add(kumanya);



        BigDecimal toplamTutar = sepet.toplamOdenecekTutar();
        System.out.println("Ödenecek Tutar = "+ toplamTutar + " Tl");
    }
}
