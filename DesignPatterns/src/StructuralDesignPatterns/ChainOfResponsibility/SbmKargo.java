package StructuralDesignPatterns.ChainOfResponsibility;

public class SbmKargo {

    public static KargoSirketi getKargoSirketi(){
        CankiriSube cankiriSube = new CankiriSube();
        AnkaraSube ankaraSube = new AnkaraSube();
        IstanbulSube istanbulSube = new IstanbulSube();
        AntalyaSube antalyaSube = new AntalyaSube();

        KargoSirketi sbmKargo = cankiriSube.
                setSonrakiKargoSirketi(ankaraSube.
                        setSonrakiKargoSirketi(istanbulSube.
                                setSonrakiKargoSirketi(antalyaSube)
                        )
                );
        return sbmKargo;
    }

}
