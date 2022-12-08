package com.yigitb.odev5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.yigitb.odev5.databinding.ActivityMainBinding;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.net.ConnectException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    TextView resultText, enterNumberText;
    MaterialButton buttonC, buttonParantezAc, buttonParantezKapat;
    MaterialButton buttonBolme, buttonLog, buttonCarpma, buttonCikarma, buttonToplama, buttonEsittir;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAC, buttonNokta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        enterNumberText = findViewById(R.id.enterNumberText);

        assignId(buttonC, R.id.buttonC);
        assignId(buttonParantezAc, R.id.buttonC);
        assignId(buttonParantezKapat, R.id.buttonC);
        assignId(buttonBolme, R.id.buttonC);
        assignId(buttonCarpma, R.id.buttonC);
        assignId(buttonCikarma, R.id.buttonC);
        assignId(buttonToplama, R.id.buttonC);
        assignId(buttonLog, R.id.buttonC);
        assignId(buttonLog, R.id.buttonC);
        assignId(buttonC, R.id.buttonC);
        assignId(button0, R.id.button0);
        assignId(button1, R.id.button1);
        assignId(button2, R.id.button2);
        assignId(button3, R.id.button3);
        assignId(button4, R.id.button4);
        assignId(button5, R.id.button5);
        assignId(button6, R.id.button6);
        assignId(button7, R.id.button7);
        assignId(button8, R.id.button8);
        assignId(button9, R.id.button9);
        assignId(buttonAC, R.id.buttonAC);
        assignId(buttonNokta, R.id.buttonNokta);


    }

    void assignId(MaterialButton btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = enterNumberText.getText().toString();

        if (buttonText.equals("AC")) {
            enterNumberText.setText("");
            resultText.setText("0");
            return;
        }

        if (buttonText.equals("=")) {
            enterNumberText.setText(resultText.getText());
            return;
        }

        if (buttonText.equals("C")) {
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
        } else {
            dataToCalculate = dataToCalculate + buttonText;
        }
        enterNumberText.setText(dataToCalculate);

        String finalResult = getResult(dataToCalculate);

        if (finalResult.equals("Err")) {
            resultText.setText(finalResult);
        }

    }

    String getResult(String data) {
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initSafeStandardObjects();
            String finalResult = context.evaluateReader(scriptable, data, "Javascript", 1, null).toString();
            if(finalResult.endsWith(".0")){
                finalResult=finalResult.replace(".0", "");
            }

            return finalResult;
        } catch (Exception e) {
            return "Err";
        }
    }


}