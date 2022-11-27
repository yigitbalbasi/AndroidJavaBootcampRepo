package com.yigitb.javadersleri.nesne_tabanli_programlama.override_kullanimi;

public class Kedi extends Memeli {
    @Override
    public void sesCikar(){
        //aşağıdaki ifadeyi silmezsek
        //memeli sınıfındaki sesçıkar fonk calısır
        //super.sesCikar();

        System.out.println("Hav Hav");
    }
}
