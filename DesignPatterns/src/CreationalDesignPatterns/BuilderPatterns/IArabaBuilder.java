package CreationalDesignPatterns.BuilderPatterns;

public abstract class IArabaBuilder {
    protected Araba araba;
    public Araba getAraba() {
        return araba;
    }

    public abstract void SetMarka();
    public abstract void SetModel();
    public abstract void SetKM();
    public abstract void SetVites();
}
class OpelConcreteBuilder extends IArabaBuilder{
    public OpelConcreteBuilder()
    {
        araba = new Araba();
    }
    public void SetKM() {
        araba.KM = 100;
    }
    public void SetMarka(){araba.Marka = "Opel";}
    public void SetModel(){araba.Model = "Astra";}
    public void SetVites(){araba.Vites = true;}
}
class ToyotaConcreteBuilder extends IArabaBuilder{
    public ToyotaConcreteBuilder()
    {
        araba = new Araba();
    }
    public void SetKM(){araba.KM = 150;}
    public void SetMarka(){araba.Marka = "Toyota";}
    public void SetModel(){araba.Model = "Corolla";}
    public void SetVites(){araba.Vites = true;}
}
class BMWConcreteBuilder extends IArabaBuilder{
    public BMWConcreteBuilder()
    {
        araba = new Araba();
    }
    public void SetKM(){araba.KM = 25;}
    public void SetMarka(){araba.Marka = "BMW";}
    public void SetModel(){araba.Model = "X Bilmem Kaç";}
    public void SetVites(){araba.Vites = true;}
}
