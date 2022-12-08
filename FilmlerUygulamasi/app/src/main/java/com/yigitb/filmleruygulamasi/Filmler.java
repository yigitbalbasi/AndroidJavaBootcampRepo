package com.yigitb.filmleruygulamasi;

import java.io.Serializable;

public class Filmler implements Serializable {
    private int id;
    private String ad;
    private String resimAdi;
    private int yil;
    private double fiyat;
    private String yonetmen;

    public Filmler(int id, String ad, String resimAdi, int yil, double fiyat, String yonetmen) {
        this.id = id;
        this.ad = ad;
        this.resimAdi = resimAdi;
        this.yil = yil;
        this.fiyat = fiyat;
        this.yonetmen = yonetmen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }


}
