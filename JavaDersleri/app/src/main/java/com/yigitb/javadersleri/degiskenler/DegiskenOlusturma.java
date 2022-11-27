package com.yigitb.javadersleri.degiskenler;

public class DegiskenOlusturma {

    public static void main(String[] args) {
        String ad = "yigit";
        String soyad = "balbasi";
        double boy = 185.0;
        Character adinBasHarfi = 'Y';
        boolean devamDurumu = true;

        System.out.println("ad:" + "" + ad);
        System.out.println("soyad" + "" + soyad);
        System.out.println("boy:" + "" + boy);
        System.out.println("adinin baş harfi" + "" + adinBasHarfi);
        System.out.println("Okula geliyor mu " + "" + devamDurumu);

        int urun_id = 3416;
        String urun_adi = "Kol saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikcisi = "Rolex";

        System.out.println("ürün id:" + urun_id);
        System.out.println("urun adi" + urun_adi);
        System.out.println("ürün adet" + urun_adet);
        System.out.println("urun fiyat" + urun_fiyat + "$");
        System.out.println("ürün tedarikçisi" + urun_tedarikcisi);

        //Tür Dönüşümü
        //Type Casting

        //Sayısaldan Sayısala
        int i = 67;
        double d = 45.78;

        //double veri tipinin boyutu int veri tipinden büyüktür
        int sonuc1 = (int) d;    //explicit Büyük değeri küçüğe aktarma
        double sonuc2 = i;        //unexplicit    küçük değeri büyük değere aktarma
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        //Sayısaldan Metine
        String sonuc3 = String.valueOf(d);  //"45.78"
        String sonuc4 = String.valueOf(i);  //4
        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //Metinden Sayısala Dönüşüm
        String yazi1 = "56";
        String yazi2 = "23.87";
        int sonuc5 = Integer.parseInt(yazi1);       //56
        double sonuc6 = Double.parseDouble(yazi2);  //23.87

    }


}
