package com.yigitb.javadersleri.hafta1_ders2_odev;

public class OdevHafta1Ders2Main {
    public static void main(String[] args) {

        OdevHafta1Ders2 o = new OdevHafta1Ders2();

        //1
        double mil = o.kilometroToMile(45);
        System.out.println("Mil karşılığı : " + mil);
        //2
        double dikdortgenAlan = o.dikdortgenAlan(4, 9);
        System.out.println("Dikdortgen alanı : " + dikdortgenAlan);
        //3
        int faktoriyelHesap = o.faktoriyel(6);
        System.out.println("faktoriyel : " + faktoriyelHesap);
        //4
        int sayac = o.eHarfiBulmaca("abecede");
        System.out.println("E harfi sayısı : " + sayac);
        //5
        int herBirIcAci = o.cokgenHesabi(7);
        System.out.println("Herbir içaçı : " + herBirIcAci);

        //6
        int maasim = o.maasHesabi(25);
        System.out.println("Maaşım : " + maasim);

        //7
        int ucret = o.otoparkUcreti(11);
        System.out.println(ucret);

    }
}
