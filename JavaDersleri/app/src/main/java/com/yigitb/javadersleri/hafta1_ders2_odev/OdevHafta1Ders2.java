package com.yigitb.javadersleri.hafta1_ders2_odev;

public class OdevHafta1Ders2 {


    //1.ornek
    public double kilometroToMile(int km) {
        return km * 0.621;
    }

    //2.ornek
    public double dikdortgenAlan(int kenar1, int kenar2) {
        return kenar1 * kenar2;
    }

    //3.örnek
    public int faktoriyel(int nSayisi) {
        int sonuc = 1;
        for (int i = 1; i < (nSayisi + 1); i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

    //parametre olarak girilen kelimedeki e sayısını hesaplayan fonk
    //for dongusunde lenght = N sayısı
    //N. indisteki harfi char nHarfi='n' ile karşılaştır sayacı bir arttır

    //4.örnek
    public int eHarfiBulmaca(String parametre) {
        int sayac = 0;
        parametre = "enenene";
        int harfSayisi = parametre.length();

        for (int i = 1; i < (harfSayisi + 1); i++) {
            char parametredekiHarf = parametre.charAt(i);
            if (parametredekiHarf == 'e') {
                sayac++;
            }
        }
        return sayac;

    }


    public int cokgenHesabi(int kenarSayisi) {
        return ((kenarSayisi - 2) * 180) / kenarSayisi;
    }

    //input: gün sayısı -> maaş hesabı ->return maaş
    //1 günde 8 saat work
    //çalışma saatlik ücret=40
    //mesai saatlik ücret=80;
    //150 saat ve üzeri mesai sayılır

    public int maasHesabi(int gunSayisi) {

        int calisilanSaat = gunSayisi * 8;
        int mesaiSaati = 0;
        int maas = 0;
        if (calisilanSaat > 150) {
            mesaiSaati = calisilanSaat - 150;
            calisilanSaat=150;
            maas = mesaiSaati * 80 + calisilanSaat * 40;
        } else {
            maas = calisilanSaat * 40;
        }
        return maas;

    }

    //1 saat=50 tl
    //+1 de her saat = 10tl

    public int otoparkUcreti(int saat){
        int toplamUcret=0;
        if (saat==1){
            toplamUcret=50;
        }
        else {
            toplamUcret=(saat-1)*10+50;
        }
        return  toplamUcret;
    }




}
