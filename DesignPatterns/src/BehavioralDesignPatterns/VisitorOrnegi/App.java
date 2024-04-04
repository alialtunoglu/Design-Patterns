package BehavioralDesignPatterns.VisitorOrnegi;

public class App {
    public static void main(String[] args) {
        Bilgisayar pc = new Bilgisayar("Monster");
        pc.accept(new CanonYazici());
    }
}
