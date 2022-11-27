package com.yigitb.javadersleri.nesne_tabanli_programlama;

public class ArabaMain {

    public static void main(String[] args) {
        //Nesne oluşturma
        Araba bmw = new Araba();
        //Değer atama
        bmw.renk = "Mavi";
        bmw.hiz = 100;
        bmw.calisiyoMu = true;

        //Değer okuma
        System.out.println("Renk:" + bmw.renk);
        System.out.println("Hız:" + bmw.hiz);
        System.out.println("Çalışıyo mu:" + bmw.calisiyoMu);

        Araba sahin = new Araba();
        sahin.renk = "Beyaz";
        sahin.hiz = 0;
        sahin.calisiyoMu = false;

        //Değer okuma
        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.hizlan(100);
        sahin.bilgiAl();
        sahin.yavasla(50);
        sahin.bilgiAl();
        sahin.durdur();
        sahin.bilgiAl();


        Araba mercedes = new Araba("Kırmızı", 150, true);
        mercedes.bilgiAl();

    }
}
