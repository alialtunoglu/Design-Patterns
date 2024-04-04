package StructuralDesignPatterns.ChainOfResponsibility;

public enum EnumIl {
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars")
    ;

    private String il;

    EnumIl(String il) {
        this.il=il;
    }
    public String getIl(){
        return il;
    }

    @Override
    public String toString() {
        return il;
    }
}
