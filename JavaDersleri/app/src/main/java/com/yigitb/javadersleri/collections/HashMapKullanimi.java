package com.yigitb.javadersleri.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        HashMap<Integer, String> iller = new HashMap<>();

        //Veri ekleme
        iller.put(16, "BURSA");
        iller.put(34, "İSTANBUL");
        iller.put(6, "ANKARA");
        iller.put(31, "MERSİN");
        System.out.println(iller);

        //Guncellemek
        iller.put(16, "YENİ BURSA");
        System.out.println(iller);

        //Veri okuma
        String il = iller.get(34);
        System.out.println("Sonuc : " + il);

        System.out.println("Boş mu : " + iller.isEmpty());
        System.out.println("Boyut : " + iller.size());
        System.out.println("İçeriyo mu (Key) : " + iller.containsKey(45));
        System.out.println("İçeriyo mu (Key) : " + iller.containsValue("ANKARA"));

        Set<Integer> anahtarlar = iller.keySet();

        for (Integer a : anahtarlar) {
            System.out.println("Sonuç : " + iller.get(a));
        }

        iller.remove(16);
        System.out.println(iller);

        iller.clear();
        System.out.println(iller);
    }
}
