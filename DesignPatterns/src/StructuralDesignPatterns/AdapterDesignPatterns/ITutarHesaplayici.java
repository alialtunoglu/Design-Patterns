package StructuralDesignPatterns.AdapterDesignPatterns;

import java.util.Scanner;

public interface ITutarHesaplayici {
    double Hesapla(double fiyat, double adet);
}
class MalzemeTipineGoreToplamTutariniHesapla implements ITutarHesaplayici{

    @Override
    public double Hesapla(double fiyat, double adet) {
        return fiyat*adet;
    }
}
class Adapter implements ITutarHesaplayici{

    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public double Hesapla(double fiyat, double adet) {
        return adaptee.IskontoluTutarHesapla(fiyat,adet);
    }
}
class Adaptee {
    public double IskontoluTutarHesapla(double fiyat, double adet){
        System.out.println("İskonto miktarını giriniz");
        Scanner input  = new Scanner(System.in);
        double iskonto = input.nextDouble();
        return fiyat*adet*(1-iskonto);
    }
}
class Client{
    public void OdenecekMeblayiHesapla(ITutarHesaplayici hesaplayici){
        System.out.println("Lütfen fiyatı giriniz");
        Scanner input = new Scanner(System.in);
        double fiyat =  input.nextDouble();
        System.out.println("Lütfen Miktar giriniz");
        double miktar =  input.nextDouble();
        System.out.println("Tutar= "+ hesaplayici.Hesapla(fiyat,miktar));
    }
}
class Program {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Adapter adapter = new Adapter();
        String tercih= null;
        Client client = new Client();
        try
        {
            while (true){
                System.out.println("İşlem tutarını hesaplamak için 1'e,"+"\nİskontolu tutar hesaplamak için 2'ye "+"\nUygulamadan çıkmak için 3'e basınız.\n");
                tercih = input.nextLine();
                int secenek = Integer.valueOf(tercih);
                if(secenek == 1){
                    client.OdenecekMeblayiHesapla(new MalzemeTipineGoreToplamTutariniHesapla());
                }else if (secenek == 2){
                    client.OdenecekMeblayiHesapla(new Adapter());
                }else{
                    return;
                }

            }
        }catch(Exception e) {
            System.out.println("Hata ile karşılaşıldı. Uygulama sonlanacaktır");
            Thread.sleep(1500);
        }

    }
}
