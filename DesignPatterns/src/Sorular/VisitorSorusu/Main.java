package Sorular.VisitorSorusu;

interface Kullanici {
    boolean HesapOku(String hesapNo);
    void accept(IVisitor visitor);
}

class Yetkili implements Kullanici {
    private String no;
    Yetkili (String No) {
        this.no = No;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public boolean HesapOku(String hesapNo) {
        return true;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
class DigerEleman implements Kullanici {
    private String no;
    DigerEleman(String No) {
        no = No;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public boolean HesapOku(String hesapNo) {
        return true;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
interface IVisitor{
    boolean visit(Kullanici kullanici);
    boolean visit(DigerEleman digerEleman);
}
class KimlikOkuyucu implements IVisitor{

    @Override
    public boolean visit(Kullanici kullanici) {
        System.out.println("Yetkili -> kullanıcının kimlik bilgilerini okur");
        return true;
    }
    public boolean visit(DigerEleman digerEleman){
        System.out.println("Diğer elemanın kimlik bilgilerini okuma yetkisi yok");
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Yetkili y1 = new Yetkili("1234");
        DigerEleman dE1 = new DigerEleman("1234");
        IVisitor kimlikOkuyucu = new KimlikOkuyucu();

        y1.HesapOku(y1.getNo());
        dE1.HesapOku(dE1.getNo());

        y1.accept(kimlikOkuyucu);

    }
}
