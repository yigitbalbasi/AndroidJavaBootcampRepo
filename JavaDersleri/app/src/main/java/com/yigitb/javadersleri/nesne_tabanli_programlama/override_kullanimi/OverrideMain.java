package com.yigitb.javadersleri.nesne_tabanli_programlama.override_kullanimi;

public class OverrideMain {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Memeli memeli = new Memeli();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        hayvan.sesCikar();  //kalıtım yok, kendi metodunu calıstırdı
        memeli.sesCikar();  //kalıtım var, hayvandaki metodunu calıstırdı
        kedi.sesCikar();    //kalıtım var, hayvandaki metodunu override edip kendi fonksiyonunu çalıştırdı
        kopek.sesCikar();   //kalıtım var, hayvandaki metodunu override edip kendi fonksinonunu çalıştırdı
    }
}
