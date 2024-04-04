package BehavioralDesignPatterns.VisitorOrnegi;

public class Tablet extends IElektronik {


    public Tablet(String model) {
        this.model = model;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.yazdir(this);
    }
}
