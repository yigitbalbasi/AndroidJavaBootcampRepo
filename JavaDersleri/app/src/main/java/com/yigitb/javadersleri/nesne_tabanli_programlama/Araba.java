package com.yigitb.javadersleri.nesne_tabanli_programlama;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyoMu;
    int kacKm;


    public Araba() {
        System.out.println("Boş constructor çalıştı");
    }

    public Araba(String renk, int hiz, boolean calisiyoMu) {
        System.out.println("Dolu constructor calıstı");
        this.renk = renk;   //shadowing this=Araba sınıfı
        this.hiz = hiz;     //shadowing
        this.calisiyoMu = calisiyoMu;   //dışardan gelen renk içerdeki renge eşitlenir.
    }

    public void calistir() {
        hiz = 5;
        calisiyoMu = true;
    }

    public void durdur() {
        hiz = 0;
        calisiyoMu = false;
    }

    public void hizlan(int kacKm) {
        hiz = hiz + kacKm;
    }

    public void yavasla(int kacKm) {
        hiz = hiz + kacKm;
    }

    public void bilgiAl() {
        System.out.println("------------");
        System.out.println("Renk:" + renk);
        System.out.println("Hız:" + hiz);
        System.out.println("Calısıyo mu" + calisiyoMu);
    }
}
