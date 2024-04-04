package CreationalDesignPatterns.AbstractFactory;

public abstract class AHddProduct {
    public abstract String getHddTur();
    public abstract void hddIslem();
}
class KingstonHdd extends AHddProduct{
    @Override
    public String getHddTur() {
        return "Bu hdd türü: Kingston";
    }

    @Override
    public void hddIslem() {
        System.out.println("Kingston hdd işlemde");

    }
}
class SamsungHdd extends AHddProduct{

    @Override
    public String getHddTur() {
        return "Bu hdd türü: Samsung";
    }

    @Override
    public void hddIslem() {
        System.out.println("Samsung hdd işlemde");
    }
}
