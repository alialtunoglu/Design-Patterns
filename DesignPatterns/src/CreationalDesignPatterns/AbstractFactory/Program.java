package CreationalDesignPatterns.AbstractFactory;

public class Program {
    public static void main(String[] args) {
        Factory factory = new Factory(new SamsungFactory());
        factory.start();
    }
}
