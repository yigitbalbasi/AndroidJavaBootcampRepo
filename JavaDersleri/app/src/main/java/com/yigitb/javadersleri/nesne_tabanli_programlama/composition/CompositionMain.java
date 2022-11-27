package com.yigitb.javadersleri.nesne_tabanli_programlama.composition;

public class CompositionMain {
    public static void main(String[] args) {
        Kategoriler k1 = new Kategoriler(1, "Dram");
        Kategoriler k2 = new Kategoriler(2, "Bilim kurgu");

        Yonetmenler y1 = new Yonetmenler(1, "Christopher Nolan");
        Yonetmenler y2 = new Yonetmenler(2, "Quantin Tarantino");

        Filmler f = new Filmler(1, "Interstaller", 2014, k2, y1);

        System.out.println("Film id : " + f.getFilm_id());
        System.out.println("Film ad : " + f.getFilm_adi());
        System.out.println("getFilm_yil : " + f.getFilm_yil());
        System.out.println("getYonetmen  : " + f.getYonetmen());
        System.out.println("Kategori :" + f.getKategori());
    }
}
