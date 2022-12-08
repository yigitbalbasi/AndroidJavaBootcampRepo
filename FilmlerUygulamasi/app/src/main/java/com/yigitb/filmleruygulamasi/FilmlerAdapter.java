package com.yigitb.filmleruygulamasi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.yigitb.filmleruygulamasi.Filmler;
import com.yigitb.filmleruygulamasi.databinding.CardTasarimBinding;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Filmler> filmlerListesi;

    public FilmlerAdapter(Context mContext, List<Filmler> filmlerListesi) {
        this.mContext = mContext;
        this.filmlerListesi = filmlerListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Filmler film = filmlerListesi.get(position);
        CardTasarimBinding t = holder.binding;

        //dinamik olarak resimleri getirme kodu
        t.imageViewFilm.setImageResource(mContext.getResources()
                .getIdentifier(film.getResimAdi(),
                        "drawable", mContext.getPackageName()));

        t.textViewFiyat.setText(film.getFiyat() + " ₺");
        t.buttonSepeteEkle.setOnClickListener(view -> {
            Snackbar.make(view, film.getAd() + " Sepete Eklendi", Snackbar.LENGTH_LONG)
                    .show();
        });

        t.cardViewFilm.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, DetayActivity.class);
            intent.putExtra("nesne", film);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return filmlerListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;

        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
