package BehavioralDesignPatterns.VisitorOrnegi;

public class CanonYazici implements IVisitor{
    @Override
    public void yazdir(IElektronik iElektronik) {
        System.out.println("canon yazıcı ile yazdırıldı");
    }
}
