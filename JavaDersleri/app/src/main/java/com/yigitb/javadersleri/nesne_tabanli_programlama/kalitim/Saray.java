package com.yigitb.javadersleri.nesne_tabanli_programlama.kalitim;

public class Saray extends Ev {

    public int getKuleSayisi() {
        return kuleSayisi;
    }

    public void setKuleSayisi(int kuleSayisi) {
        this.kuleSayisi = kuleSayisi;
    }

    private int kuleSayisi;

    public Saray(int kuleSayisi) {
        System.out.println("saray dolu constructor");
        this.kuleSayisi = kuleSayisi;
    }

    public Saray() {
        //sarayın boş constructor'unda veri göndererek çalıştırdı
        //yani pencere sayısı vererek calıstı
        super(99);
        System.out.println("saray boş constructor");

    }

}
