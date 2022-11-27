package com.yigitb.javadersleri.nesne_tabanli_programlama.kalitim;

public class Villa extends Ev {
    public Villa() {
        System.out.println("villa boş constructor");
    }

    public Villa(boolean garajVarMi) {
        System.out.println("villa dolu constructor");
        this.garajVarMi = garajVarMi;
    }

    public boolean isGarajVarMi() {
        return garajVarMi;
    }

    public void setGarajVarMi(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }

    private boolean garajVarMi;
}
