package CreationalDesignPatterns.BuilderPatterns;

public class Program {

    public static void main(String[] args) {
        ArabaUret uret = new ArabaUret();

        IArabaBuilder araba = new OpelConcreteBuilder();
        uret.Uret(araba);
        System.out.println(araba.getAraba().toString());

        araba = new ToyotaConcreteBuilder();
        uret.Uret(araba);
        System.out.println(araba.getAraba().toString());


    }
}
