package StructuralDesignPatterns.CompositeDesignPatterns.NotComposite;

import java.util.ArrayList;
import java.util.List;

public class Paket {

    private String adi;
    private List<Urun> urunList;

    public Paket(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
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
}
