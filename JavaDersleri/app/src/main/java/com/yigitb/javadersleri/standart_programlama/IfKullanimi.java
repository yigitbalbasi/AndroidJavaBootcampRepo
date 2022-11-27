package com.yigitb.javadersleri.standart_programlama;

public class IfKullanimi {
    public static void main(String[] args) {

        int yas = 19;
        String isim = "Ahmet";

        if (yas >= 18) {
            System.out.println("Resitsin");
        } else {
            System.out.println("Resit değilsin");
        }

        if (isim == "Ahmet") {
            System.out.println("Merhaba Ahmet");
        } else if (isim == "Mehmet") {
            System.out.println("Meraba Mehmet");
        } else {
            System.out.println("Tanınmayan kişi");
        }

        String ka = "admin";
        int sifre = 1234;

        if (ka == "admin" && sifre == 1234) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("giriş başarısız");
        }

        int sayi = 10;
        if (sayi == 9 || sayi == 10) {
            System.out.println("sayi 9 veya 10");
        } else {
            System.out.println("sayi 9 veya 10 değildir");
        }

    }
}
