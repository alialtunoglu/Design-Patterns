package StructuralDesignPatterns.ChainOfResponsibility;

public abstract class KargoSirketi {

    private EnumIl enumIl;
    private KargoSirketi sonrakiKargoSirketi;

    public KargoSirketi(EnumIl enumIl){
        this.enumIl=enumIl;
    }

    public EnumIl getEnumIl() {
        return enumIl;
    }

    public KargoSirketi getSonrakiKargoSirketi() {
        return sonrakiKargoSirketi;
    }

    public KargoSirketi setSonrakiKargoSirketi(KargoSirketi sonrakiKargoSirketi) {
        this.sonrakiKargoSirketi = sonrakiKargoSirketi;

        return this;

    }
    public void kargola(EnumIl il) {

        gelenKargoBilgileriYazdir(il);

        //Bana gelen il kargolanmak istenen il ile aynı mı

        if(getEnumIl().equals(il)){
            kargoTeslimBilgileriYazdir();
        }
        else if (getSonrakiKargoSirketi() != null){
            getSonrakiKargoSirketi().kargola(il);
        }
        else{
            hizmetAlaniDisiYazdir(il);
        }
    }

    private void hizmetAlaniDisiYazdir(EnumIl il) {
        System.out.println(il.getIl() + " hizmet alanının dışındadır");
    }

    private void gelenKargoBilgileriYazdir(EnumIl il) {
        System.out.println(il.getIl() + " iline gidecek kargo "  + getEnumIl().getIl() + " Şubesine geldi.");
    }

    private void kargoTeslimBilgileriYazdir() {
        System.out.println(getEnumIl().getIl() + " Şube teslim aldı" );
    }
}
