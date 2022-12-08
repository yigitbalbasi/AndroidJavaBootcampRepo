package com.yigitb.filmleruygulamasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.yigitb.filmleruygulamasi.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //iki kolonlu bi yapı için
        binding.rv.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Filmler> filmlerListesi = new ArrayList<>();
        Filmler f1 = new Filmler(1, "Anadoluda", "anadoluda", 2005, 13.99, "N.B. Ceylan");
        Filmler f2 = new Filmler(2, "Django", "django", 2011, 17.99, "Q.Tarantino");
        Filmler f3 = new Filmler(3, "Inception", "inception", 2014, 23.99, "C.Nolan");
        Filmler f4 = new Filmler(4, "Interstellar", "interstellar", 2003, 24.99, "C.Nolan");
        Filmler f5 = new Filmler(5, "The Hateful Eight", "thehatefuleight", 2012, 19.99, "Q.Tarantino");
        Filmler f6 = new Filmler(6, "The Pianist", "thepianist", 2007, 8.99, "R.Polanski");

        filmlerListesi.add(f1);
        filmlerListesi.add(f2);
        filmlerListesi.add(f3);
        filmlerListesi.add(f4);
        filmlerListesi.add(f5);
        filmlerListesi.add(f6);

        FilmlerAdapter adapter = new FilmlerAdapter(this, filmlerListesi);
        binding.rv.setAdapter(adapter);


    }
}