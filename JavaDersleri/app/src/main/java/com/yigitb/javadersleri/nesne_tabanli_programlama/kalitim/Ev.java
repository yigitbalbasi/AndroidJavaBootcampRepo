package com.yigitb.javadersleri.nesne_tabanli_programlama.kalitim;

public class Ev {
    private int pencereSayisi;

    public Ev(){
        System.out.println("ev boş constructor");
    }

    public Ev(int pencereSayisi) {
        System.out.println("ev dolu constructor");
        this.pencereSayisi = pencereSayisi;
    }

    public int getPencereSayisi() {
        return pencereSayisi;
    }

    public void setPencereSayisi(int pencereSayisi) {
        this.pencereSayisi = pencereSayisi;
    }


}
