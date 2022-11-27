package com.yigitb.javadersleri.nesne_tabanli_programlama.kalitim;

public class KatilimMain {
    public static void main(String[] args) {
        Saray topkapiSarayi = new Saray();

        topkapiSarayi.setPencereSayisi(200);
        topkapiSarayi.setKuleSayisi(10);

        System.out.println(topkapiSarayi.getPencereSayisi());
        System.out.println(topkapiSarayi.getKuleSayisi());


        Villa bogazVilla = new Villa();

        bogazVilla.setPencereSayisi(30);
        bogazVilla.setGarajVarMi(true);

        System.out.println(bogazVilla.isGarajVarMi());
        System.out.println(bogazVilla.getPencereSayisi());

    }
}
