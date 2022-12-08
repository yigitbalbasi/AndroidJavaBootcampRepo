package com.yigitb.filmleruygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import com.yigitb.filmleruygulamasi.databinding.ActivityDetayBinding;

public class DetayActivity extends AppCompatActivity {
    private ActivityDetayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Filmler f = (Filmler) getIntent().getSerializableExtra("nesne");
        binding.toolbarDetay.setTitle(f.getAd());
        binding.tvFiyat.setText(String.valueOf(f.getFiyat()));
        binding.ivFilm.setImageResource(getResources()
                .getIdentifier(f.getResimAdi(),
                        "drawable", getPackageName()));
        binding.tvYil.setText(String.valueOf(f.getYil()));
        binding.tvYonetmen.setText(f.getYonetmen());
        binding.buttonSiparis.setOnClickListener(view -> {
            Snackbar.make(view, f.getAd() + " sipariş verildi", Snackbar.LENGTH_LONG).show();
        });



    }
}