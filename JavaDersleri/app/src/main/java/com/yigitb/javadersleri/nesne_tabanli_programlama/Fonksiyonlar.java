package com.yigitb.javadersleri.nesne_tabanli_programlama;

public class Fonksiyonlar {
    //void çalışıyo işlemini bitiriyo veri taşımıyo
    //return veri transferi yapmaya yarıyo

    //void
    public void selamla() {
        String sonuc = "Merhaba Ahmet";
        System.out.println(sonuc);
    }

    //return
    public String selamla1() {
        String sonuc = "Merhaba Ahmet";
        return sonuc;
    }

    //parametre
    public void selamla2(String isim) {
        String sonuc2 = "Merhaba" + isim;
        System.out.println(sonuc2);
    }

    public int toplama(int a, int b) {
        return a + b;
    }

    //Overloading
    //bir fonksiyonun aynı adla ama farklı parametrelerle
    //kullanılması
    public void carp(int sayi1, int sayi2) {
        System.out.println("Carpma :" + (sayi1 * sayi2));
    }

    public void carp(double sayi1, int sayi2) {
        System.out.println("Carpma :" + (sayi1 * sayi2));
    }

    public void carp(double sayi1, int sayi2, String isim) {
        System.out.println("Carpma :" + (sayi1 * sayi2) + "İşlem yapan :" + isim);
    }


}