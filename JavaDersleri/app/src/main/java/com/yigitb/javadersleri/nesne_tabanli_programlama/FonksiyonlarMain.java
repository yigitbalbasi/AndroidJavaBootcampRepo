package com.yigitb.javadersleri.nesne_tabanli_programlama;

public class FonksiyonlarMain {
    public static void main(String[] args) {
        Fonksiyonlar f = new Fonksiyonlar();

        f.selamla();

        String gelenSonuc = f.selamla1();
        System.out.println("gelen sonuc" + gelenSonuc);

        f.selamla2("Yigit");

        int gelenToplam = f.toplama(10, 20);
        System.out.println("Gelen toplam :" + gelenToplam);


        f.carp(3, 6, "Beyza");
        f.carp(3.2, 6);


    }
}
