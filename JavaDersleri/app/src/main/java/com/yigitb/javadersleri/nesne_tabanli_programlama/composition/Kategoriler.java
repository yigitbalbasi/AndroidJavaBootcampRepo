package com.yigitb.javadersleri.nesne_tabanli_programlama.composition;

public class Kategoriler {

    private int kategori_id;
    private String kategori_adi;

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getKategori_adi() {
        return kategori_adi;
    }

    public void setKategori_adi(String kategori_adi) {
        this.kategori_adi = kategori_adi;
    }


    public Kategoriler(int kategori_id, String kategori_adi) {
        this.kategori_id = kategori_id;
        this.kategori_adi = kategori_adi;
    }

}
