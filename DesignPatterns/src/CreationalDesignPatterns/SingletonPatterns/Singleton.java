package CreationalDesignPatterns.SingletonPatterns;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private static int sayi ;



    private Singleton() {
        System.out.println("Ben oluştum");
    }

    public static Singleton getSingleton(){
        sayi++;
        System.out.println(sayi);
        return singleton;}
}
