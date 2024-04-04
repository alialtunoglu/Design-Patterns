package StructuralDesignPatterns.CompositeDesignPatterns.Composite;

import java.math.BigDecimal;
import java.util.List;

public class FiyatHesaplamaUtil {

    public static BigDecimal getToplamUrunFiyat(List<Urun> urunList){
        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamTutar = toplamTutar.add(urun.getFiyat());
        }
        return toplamTutar;
    }
    public static BigDecimal getToplamPaketFiyat(List<Paket> paketList){
        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Paket paket : paketList) {
            toplamTutar = toplamTutar.add(paket.getFiyat());
        }
        return toplamTutar;
    }

}
