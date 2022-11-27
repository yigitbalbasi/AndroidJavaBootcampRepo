package com.yigitb.javadersleri.collections;

import java.util.ArrayList;

public class ArrayListKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        ArrayList<String> meyveler = new ArrayList<>();

        //Veri Ekleme
        meyveler.add("Muz");    //0
        meyveler.add("Elma");   //1
        meyveler.add("Kiraz");  //2
        System.out.println(meyveler);

        //Güncelleme
        meyveler.set(1, "Yeni Elma");
        System.out.println(meyveler);

        //Insert
        meyveler.add(1, "Portakal");
        System.out.println(meyveler);

        //Veri okuma
        String meyve = meyveler.get(2);
        System.out.println("Sonuc : " + meyve);

        System.out.println("Boş mu : " + meyveler.isEmpty());
        System.out.println("Boyut : " + meyveler.size());
        System.out.println("İçeriyor mu : " + meyveler.contains("Muz"));

        //For each
        for (String meyve2 : meyveler) {
            System.out.println("Sonuç : " + meyve2);
        }

        for (int i = 0; i < meyveler.size(); i++) {
            System.out.println(i + ". -> " + meyveler.get(i));
        }

        meyveler.remove(2);
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);

    }
}
