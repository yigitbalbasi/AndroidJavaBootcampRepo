package com.yigitb.javadersleri.collections;

import java.util.HashSet;

public class HashSetKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        HashSet<String> meyveler = new HashSet<>();

        //veri ekleme
        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Kiraz");
        System.out.println(meyveler);

        meyveler.add("Amasya Elmasi");
        System.out.println(meyveler);

        System.out.println("Boş kontrol : " + meyveler.isEmpty());
        System.out.println("Boyut : " + meyveler.size());
        System.out.println("içeriyor mu : " + meyveler.contains("Muz"));

        for (String m : meyveler) {
            System.out.println("Sonuç : " + m);
        }

        meyveler.remove("Muz");
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);


    }
}
