package CreationalDesignPatterns.BuilderPatterns;

//Product Class
public class Araba {
    public String Marka;
    public String Model;
    public double KM;
    public boolean Vites;

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getKM() {
        return KM;
    }

    public void setKM(double KM) {
        this.KM = KM;
    }

    public boolean isVites() {
        return Vites;
    }

    public void setVites(boolean vites) {
        Vites = vites;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", KM=" + KM +
                ", Vites=" + Vites +
                '}';
    }
}
