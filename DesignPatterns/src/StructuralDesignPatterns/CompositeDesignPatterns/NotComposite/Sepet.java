package StructuralDesignPatterns.CompositeDesignPatterns.NotComposite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;
    //Kumanya diye bir paket ve urun birleşimi bir sistem geldiğinde burada değişiklik yapmamız gerekecek buda open-closed'a ters düşüyor
    //İyi bir tasarım yapmamış oluyoruz.

    public Sepet(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
    }
    public BigDecimal getToplamTutar(){
        BigDecimal toplamTutar = BigDecimal.ZERO;//0 olsun
        for(Urun urun: urunList){
            toplamTutar= toplamTutar.add(urun.getFiyat());
        }
        for (Paket paket : paketList) {
            List<Urun> urunList = paket.getUrunList();
            for(Urun urun: urunList){
                toplamTutar= toplamTutar.add(urun.getFiyat());
            }
        }
        return toplamTutar;
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
