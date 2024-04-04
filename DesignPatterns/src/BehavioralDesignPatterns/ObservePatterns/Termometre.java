package BehavioralDesignPatterns.ObservePatterns;

import java.math.BigDecimal;

public class Termometre extends Observable {
    private BigDecimal anlikSicaklik;
    private BigDecimal minSicaklik;
    private BigDecimal maxSicaklik;

    public Termometre(BigDecimal minSicaklik, BigDecimal maxSicaklik) {
        this.anlikSicaklik = BigDecimal.valueOf(24);
        this.minSicaklik = minSicaklik;
        this.maxSicaklik = maxSicaklik;
    }

    public BigDecimal getAnlikSicaklik() {
        return anlikSicaklik;
    }

    public void setAnlikSicaklik(BigDecimal anlikSicaklik) {
        this.anlikSicaklik = anlikSicaklik;
        System.out.println(anlikSicaklik);
        sicakligiKontrolEt();
    }
    private void sicakligiKontrolEt(){
        boolean isCokSicak = anlikSicaklik.compareTo(maxSicaklik) >= 0;
        boolean isCokSoguk = anlikSicaklik.compareTo(minSicaklik) <= 0;

        if (isCokSicak || isCokSoguk){
            haberVer();
        }

    }
}
