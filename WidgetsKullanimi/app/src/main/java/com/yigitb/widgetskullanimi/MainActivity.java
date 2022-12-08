package com.yigitb.widgetskullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import com.yigitb.widgetskullanimi.databinding.ActivityMainBinding;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonResim1.setOnClickListener(view -> {
            binding.imageView.setImageResource(R.drawable.resim1);

        });

        binding.buttonResim2.setOnClickListener(view -> {
            //default resim değişme kodu
            //binding.imageView.setImageResource(R.drawable.resim2);

            //database den gelen veriye göre resim seçme
            binding.imageView.setImageResource(getResources()
                    .getIdentifier("resim2",
                            "drawable", getPackageName()));

        });


        binding.switch1.setOnCheckedChangeListener((v, b) -> {
            //v = view b = boolean
            if (b) {
                Log.e("Widget", "switch on");
            } else {

                Log.e("Widget", "switch off");
            }
        });

        binding.checkBox.setOnCheckedChangeListener((v, b) -> {
            //v = view b = boolean
            if (b) {
                Log.e("Widget", "checkedbox on");
            } else {

                Log.e("Widget", "checkedbox off");
            }
        });

        binding.rbBarcelona.setOnCheckedChangeListener((v, b) -> {
            //v = view b = boolean
            if (b) {
                Log.e("Widget", "Barcelona seçildi");
            }
        });

        binding.rbRealMadrid.setOnCheckedChangeListener((v, b) -> {
            //v = view b = boolean
            if (b) {
                Log.e("Widget", "Real Madrid seçildi");
            }
        });

        binding.buttonBasla.setOnClickListener(view -> {
            binding.progressBar.setVisibility(View.VISIBLE);
        });

        binding.buttonDur.setOnClickListener(view -> {
            binding.progressBar.setVisibility(View.INVISIBLE);

        });


        binding.textViewSonuc.setText(String.valueOf(binding.slider.getProgress()));

        binding.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                // i değeri sliderdaki sayıdır
                binding.textViewSonuc.setText(String.valueOf(progress));
                Log.e("Widget", String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        binding.buttonSaat.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int saat = calendar.get(Calendar.HOUR_OF_DAY);
            int dakika = calendar.get(Calendar.MINUTE);

            //this=context istiyo , d=dialog, s =saat, dk
            TimePickerDialog pd = new TimePickerDialog(this, (d, s, dk) -> {
                binding.editTextSaat.setText(s + " : " + dk);
            }, saat, dakika, true);

            pd.setButton(DialogInterface.BUTTON_POSITIVE, "SEC", pd);
            pd.setButton(DialogInterface.BUTTON_NEGATIVE, "İPTAL", pd);

            pd.show();

        });

        binding.buttonTarih.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int yil = calendar.get(Calendar.YEAR);
            int ay = calendar.get(Calendar.MONTH);
            int gun = calendar.get(Calendar.DAY_OF_MONTH);

            //this=context istiyo , d=dialog, s =saat, dk
            DatePickerDialog pd = new DatePickerDialog(this, (d, y, a, g) -> {
                binding.editTextTarih.setText(g + " / " + (a + 1) + " / " + y);
            }, yil, ay, gun);

            pd.setButton(DialogInterface.BUTTON_POSITIVE, "SEC", pd);
            pd.setButton(DialogInterface.BUTTON_NEGATIVE, "İPTAL", pd);

            pd.show();
        });

        binding.buttonGoster.setOnClickListener(view -> {
            Log.e("Widget", "Switch durum : " + binding.switch1.isChecked());
            Log.e("Widget", "Checkbox durum : " + binding.checkBox.isChecked());
            Log.e("Widget", "Barcelona durum : " + binding.rbBarcelona.isChecked());
            Log.e("Widget", "Real Madrid durum : " + binding.rbRealMadrid.isChecked());
            Log.e("Widget", "Slider Durum : " + binding.slider.getProgress());
            Log.e("Widget", "Saat" +binding.editTextSaat.getText());
            Log.e("Widget", "Tarih" +binding.editTextTarih.getText());
        });

    }
}