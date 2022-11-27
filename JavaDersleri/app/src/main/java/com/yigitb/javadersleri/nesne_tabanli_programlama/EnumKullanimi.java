package com.yigitb.javadersleri.nesne_tabanli_programlama;

public class EnumKullanimi {
    public static void main(String[] args) {
        //aynı dosya içerisinde fonksiyon kullanabilmek için
        //fonksiyona static eklenir
        ucretHesapla(123, KonserveBoyut.ORTA);
    }

    public static void ucretHesapla(int adet, KonserveBoyut boyut) {
        switch (boyut) {
            case KUCUK:
                System.out.println("Ücret : " + (adet * 3.4) + " ₺ ");
                break;

            case ORTA:
                System.out.println("Ücret : " + (adet * 6.2) + " ₺ ");
                break;
            case BUYUK:
                System.out.println("Ücret : " + (adet * 8.2) + " ₺ ");
                break;
        }

    }
}
