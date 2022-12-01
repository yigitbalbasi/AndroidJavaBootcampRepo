package com.yigitb.odev4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.yigitb.odev4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());

        binding.buttonAyaGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // a ya git
                Log.e("Gecis","mainden a ya calıstı");
                Intent intent=new Intent(MainActivity.this,ABYRoad.class);
                startActivity(intent);


            }
        });

        binding.buttonXeGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // a ya git
                Log.e("Gecis","mainden a ya calıstı");
                Intent intent=new Intent(MainActivity.this,XYRoad.class);
                startActivity(intent);
            }
        });


       // NavHostFragment navHostFragment=(NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.maindenAyaGecis);

    }
}