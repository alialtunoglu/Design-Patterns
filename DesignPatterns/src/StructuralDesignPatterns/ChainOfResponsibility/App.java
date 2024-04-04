package StructuralDesignPatterns.ChainOfResponsibility;

public class App {

    public static void main(String[] args) {
        KargoSirketi sbmKargo = SbmKargo.getKargoSirketi();

        sbmKargo.kargola(EnumIl.KARS);
        System.out.println("\n--------------\n");
        sbmKargo.kargola(EnumIl.ANTALYA);
        System.out.println("\n--------------\n");
        sbmKargo.kargola(EnumIl.ISTANBUL);
        System.out.println("\n--------------\n");
        sbmKargo.kargola(EnumIl.ANKARA);
    }
}
