package com.yigitb.javadersleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//override kalıtımla çalışır
//hayvan ses cıkart -> kedi-> miyav
//                  -> köpek-> hav

//overloading katılımsız calısır
//aynı adlı fonk veya degişken yapılır