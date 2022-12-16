package com.yigitb.mvvmkullanimi;

import androidx.lifecycle.MutableLiveData;

public class MatematikRepository {
    private MutableLiveData<String> matematikselSonuc = new MutableLiveData<>("0");

    public MutableLiveData<String> getMatematikselSonuc() {
        return matematikselSonuc;
    }

    public void topla(String alinanSayi1, String alinanSayi2) {
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);
        int toplam = sayi1 + sayi2;

        //tetikleme
        matematikselSonuc.setValue(String.valueOf(toplam));

    }

    public void carp(String alinanSayi1, String alinanSayi2) {


        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int carpma = sayi1 * sayi2;

        //tetikleme
        matematikselSonuc.setValue(String.valueOf(carpma));
    }

}
