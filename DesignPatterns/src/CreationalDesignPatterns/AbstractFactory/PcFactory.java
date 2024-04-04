package CreationalDesignPatterns.AbstractFactory;

public abstract class PcFactory {

    public abstract AHddProduct createHdd();
    public abstract ARamProduct createRam();

}
class SamsungFactory extends PcFactory {

    @Override
    public AHddProduct createHdd() {
        return new SamsungHdd();
    }

    @Override
    public ARamProduct createRam() {
        return new SamsungRam();
    }
}
class KingstonFactory extends PcFactory{

    @Override
    public AHddProduct createHdd() {
        return new KingstonHdd();
    }

    @Override
    public ARamProduct createRam() {
        return new KingstonRam();
    }
}

