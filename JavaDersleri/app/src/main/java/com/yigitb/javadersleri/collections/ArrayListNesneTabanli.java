package com.yigitb.javadersleri.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.transform.Source;

public class ArrayListNesneTabanli {
    public static void main(String[] args) {
        Urunler u1 = new Urunler(1, "Telefon", 23000);
        Urunler u2 = new Urunler(2, "Süpürge", 10000);
        Urunler u3 = new Urunler(3, "Bilgisayar", 34000);

        ArrayList<Urunler> urunlerListesi = new ArrayList<>();

        urunlerListesi.add(u1);
        urunlerListesi.add(u2);
        urunlerListesi.add(u3);

        for (Urunler u : urunlerListesi) {
            System.out.println("ID : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat() + " ₺");
        }


        //sıralama
        System.out.println("------- Fiyat Artan ------");
        Collections.sort(urunlerListesi, new Siralama1());

        for (Urunler u : urunlerListesi) {
            System.out.println("ID : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat() + " ₺");
        }

        System.out.println("------- Fiyat Azalan ------");
        Collections.sort(urunlerListesi, new Siralama2());

        for (Urunler u : urunlerListesi) {
            System.out.println("ID : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat() + " ₺");
        }


        System.out.println("------- Ad Artan ------");
        Collections.sort(urunlerListesi, new Siralama3());

        for (Urunler u : urunlerListesi) {
            System.out.println("ID : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat() + " ₺");
        }


        System.out.println("------- Ad Azalan ------");
        Collections.sort(urunlerListesi, new Siralama4());

        for (Urunler u : urunlerListesi) {
            System.out.println("ID : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat() + " ₺");
        }
    }

    public static class Siralama1 implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new Integer(u1.getFiyat()).compareTo(u2.getFiyat());
        }
    }

    public static class Siralama2 implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new Integer(u2.getFiyat()).compareTo(u1.getFiyat());
        }
    }

    public static class Siralama3 implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new String(u1.getAd()).compareTo(u2.getAd());
        }
    }

    public static class Siralama4 implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new String(u2.getAd()).compareTo(u1.getAd());
        }
    }
}
