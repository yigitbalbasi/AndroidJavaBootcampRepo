package com.yigitb.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yigitb.odev4.databinding.FragmentABinding;

public class AFragment extends Fragment {
    private FragmentABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(getLayoutInflater());
        Log.e("Gecis", " a ya calıstı");

        binding.buttonByeGec.setOnClickListener(view -> {
            //b ye geç
            Log.e("Gecis", "b ye geçiliyo");
            NavDirections gecis = new ActionOnlyNavDirections(R.id.adanByeGecis);
            Navigation.findNavController(view).navigate(gecis);



        });

        return binding.getRoot();
    }
}