package BehavioralDesignPatterns.ObservePatterns;

//Bu bir takipçidir gözleyendir
public class Ebeveyn implements Observer {

    private String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observable  observable) {

        Termometre termometre = (Termometre) observable;

        System.out.println(adi+ "dedi ki: ooo sicaklik " + termometre.getAnlikSicaklik()+" derece olmuş ");

    }
}
