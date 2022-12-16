package com.yigitb.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.yigitb.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    //view model oluşturduk
    private MainActivityViewModel viewModel;

    // implementation "androidx.lifecycle:lifecycle-viewmodel:2.5.1"


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //viewbinding
        // binding = ActivityMainBinding.inflate(getLayoutInflater());
        // setContentView(binding.getRoot());

        //databinding kurulumu
        //bu sayfa üzerinde çalışcaz - this
        //activity main acılacak - R.layout.activity_main

        //databinding nesnesine yetki veriyoruz
        //bu sayede kodumuz calısabiliyo


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //viewmodel tanımlaması
        viewModel = new ViewModelProvider(this)
                .get(MainActivityViewModel.class);

        binding.setMainActivityNesnesi(this);

        //viewmodel ile sonuc değişince tetiklenecek
        viewModel.getSonuc().observe(this, s -> {
            binding.setHesaplamaSonucu(s);
        });

        //xml'de variable tanımlayarak hallettik
        //binding.textViewSonuc.setText("0");
        //databinding ile değiştirme
        // binding.setHesaplamaSonucu(viewModel.getSonuc());


/*
//viewbinding için kodlama
        binding.buttonToplama.setOnClickListener(view -> {
            String alinanSayi1 = binding.editTextSayi1.getText().toString();
            String alinanSayi2 = binding.editTextSayi2.getText().toString();

            int sayi1 = Integer.parseInt(alinanSayi1);
            int sayi2 = Integer.parseInt(alinanSayi2);

            int toplam = sayi1 + sayi2;

            binding.textViewSonuc.setText(String.valueOf(toplam));

        });

        binding.buttonCarpma.setOnClickListener(view -> {
            String alinanSayi1 = binding.editTextSayi1.getText().toString();
            String alinanSayi2 = binding.editTextSayi2.getText().toString();

            int sayi1 = Integer.parseInt(alinanSayi1);
            int sayi2 = Integer.parseInt(alinanSayi2);

            int carpma = sayi1 * sayi2;

            binding.textViewSonuc.setText(String.valueOf(toplam));
//
            int sayi3=Integer.parseInt(binding.editTextSayi1.getText().toString());
            int sayi4=Integer.parseInt(binding.editTextSayi2.getText().toString());

            binding.textViewSonuc.setText(String.valueOf(sayi3*sayi4));
//
        });
*/
    }

    public void buttonToplamaTikla(String alinanSayi1, String alinanSayi2) {
        viewModel.toplamaYap(alinanSayi1, alinanSayi2);
/*
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int toplam = sayi1 + sayi2;
*/
        // binding.textViewSonuc.setText(String.valueOf(toplam));
        // binding.setHesaplamaSonucu(String.valueOf(toplam));
        //binding.setHesaplamaSonucu(viewModel.getSonuc());
    }

    public void buttonCarpmaTikla(String alinanSayi1, String alinanSayi2) {
        viewModel.carpmaYap(alinanSayi1, alinanSayi2);
/*
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int carpma = sayi1 * sayi2;
*/
        //binding.textViewSonuc.setText(String.valueOf(carpma));
        //binding.setHesaplamaSonucu(String.valueOf(carpma));
        //binding.setHesaplamaSonucu(viewModel.getSonuc());
    }
}