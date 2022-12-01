package com.yigitb.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yigitb.odev4.databinding.FragmentBBinding;

public class BFragment extends Fragment {

    private FragmentBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("Gecis", "Bye geçildi");
        binding = FragmentBBinding.inflate(getLayoutInflater());

        binding.buttonYyeGec.setOnClickListener(view -> {
            // y ye git
            Log.e("Gecis", "y ye gidiyo");
            NavDirections gecis = new ActionOnlyNavDirections(R.id.bdenYyeGecis);
            Navigation.findNavController(view).navigate(gecis);
        });

        return binding.getRoot();
    }
}