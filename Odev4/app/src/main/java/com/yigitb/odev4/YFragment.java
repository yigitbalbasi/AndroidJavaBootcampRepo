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

import com.yigitb.odev4.databinding.FragmentYBinding;

public class YFragment extends Fragment {
private FragmentYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentYBinding.inflate(getLayoutInflater());

       binding.buttonMaineGec.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.e("Gecis","Maine dönüyom");
               NavDirections gecis = new ActionOnlyNavDirections(R.id.ydenMaineGecis);
               Navigation.findNavController(view).navigate(gecis);
           }
       });

       return binding.getRoot();
    }
}