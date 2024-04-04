package CreationalDesignPatterns.AbstractFactory;

public abstract class ARamProduct {
    public abstract String getRamTur();
    public abstract void ramIslem();
}
class KingstonRam extends ARamProduct{
    @Override
    public String getRamTur() {
        return "Bu ram türü: Kingston";
    }

    @Override
    public void ramIslem() {
        System.out.println("Kingston ram işlemde");

    }
}
class SamsungRam extends ARamProduct{
    @Override
    public String getRamTur() {
        return "Bu ram türü: Samsung";
    }

    @Override
    public void ramIslem() {
        System.out.println("Samsung ram işlemde");
    }
}
