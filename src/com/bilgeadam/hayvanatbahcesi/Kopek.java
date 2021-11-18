package com.bilgeadam.hayvanatbahcesi;

// ınheritance
// superclass'ın özelliklerini subclass alıyor.
// extends ile sağlanır.


public class Kopek extends Hayvan {

    private String KopekCins;
    private double KuyrukUzunlugu;

    public double getKuyrukUzunlugu() {
        return KuyrukUzunlugu;
    }

    public void setKuyrukUzunlugu(double kuyrukUzunlugu) {
        KuyrukUzunlugu = kuyrukUzunlugu;
    }

    public String getKopekCins() {
        return KopekCins;
    }

    public void setKopekCins(String kopekCins) {
        KopekCins = kopekCins;
    }

    // method overriding
    // superclass metodunu kendimize özgün yeniden yazıyoruz.
    public void sesCikar() {
        System.out.println("havhavhavhav");

    }

    @Override
    public String toString() {
        return "Ad:"  +getAd() + "\n" +
                "Ağırlık:" +getAgirlik()+ "\n" +
                "Uzunluk: " +getUzunluk() + "\n" +
                "Cins:" + getKopekCins() + "\n" +
                "Kuyruk Uzunluğu: " + getKuyrukUzunlugu();
    }
}
