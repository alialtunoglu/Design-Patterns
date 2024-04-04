package CreationalDesignPatterns.AbstractFactory;

public class Factory {
    PcFactory pcFactory;
    ARamProduct aRamProduct;
    AHddProduct aHddProduct;

    public Factory(PcFactory pcFactory){
        this.pcFactory = pcFactory;
        aHddProduct = pcFactory.createHdd();
        aRamProduct = pcFactory.createRam();
    }
    public void start()
    {
        System.out.println( aHddProduct.getHddTur());
        aHddProduct.hddIslem();
        System.out.println(aRamProduct.getRamTur());
        aRamProduct.ramIslem();
    }
}
