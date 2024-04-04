package BehavioralDesignPatterns.VisitorOrnegi;

public class HpYazici implements IVisitor{
    @Override
    public void yazdir(IElektronik iElektronik) {
        System.out.println("canon yazıcı ile yazdırıldı");
    }
}
