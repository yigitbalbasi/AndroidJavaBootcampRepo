package com.yigitb.javadersleri.hata_yakalama;

public class TryCatchKullanimi {
    public static void main(String[] args) {

        //1. Compile error:
        //String x = "Ali"

        //2. Runtime Error : Exception
        int x = 10;
        int y = 0;


        try {
            System.out.println("Sonuç : " + (x / y));
            System.out.println("İşlem bitti");

        } catch (Exception e) {
            System.out.println("Sıfıra bölünme hatası oluştu");
        }

    }
}
