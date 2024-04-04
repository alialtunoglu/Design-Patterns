package CreationalDesignPatterns.BuilderPatterns;

//Director Sınıfı
public class ArabaUret {
    public void Uret(IArabaBuilder Araba)
    {
        Araba.SetKM();
        Araba.SetMarka();
        Araba.SetModel();
        Araba.SetVites();
    }
}
