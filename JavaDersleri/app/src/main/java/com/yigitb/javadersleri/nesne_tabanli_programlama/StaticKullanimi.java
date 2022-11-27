package com.yigitb.javadersleri.nesne_tabanli_programlama;

public class StaticKullanimi {
    public static void main(String[] args) {
        ASinifi a = new ASinifi();

        //System.out.println(a.x);

        //a.metod();

        //sanal nesne, isimsiz nesne ( Nameless object)
        //System.out.println(new ASinifi().x);
        //new ASinifi().metod();

        //ASinifi.java'da static tarzda veri oluşturulursa
        //bu sayede daha kısa kod yazdık
        //ama bu kullanımı tercih etmemeliyiz
        System.out.println(ASinifi.x);
        ASinifi.metod();

        //final -> let(swift)->val(kotlin), dart(const)
        int sayi = 100;
        System.out.println(sayi);
        sayi = 30;
        System.out.println(sayi);
        sayi = 700;
        System.out.println(sayi);

        final int numara = 40;




    }
}
