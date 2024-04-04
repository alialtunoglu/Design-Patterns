package BehavioralDesignPatterns.VisitorOrnegi;

public class Bilgisayar extends IElektronik {

    public Bilgisayar(String model) {
        this.model = model;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.yazdir(this);
    }
}
