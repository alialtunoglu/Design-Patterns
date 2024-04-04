package BehavioralDesignPatterns.VisitorOrnegi;

public abstract class IElektronik {
    String model;
    public abstract void accept(IVisitor visitor);

}
