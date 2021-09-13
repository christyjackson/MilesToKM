package com.example.milestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonMilesToKm);
              buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText)findViewById(R.id.editTextMiles);

                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                EditText result = (EditText)findViewById(R.id.editTextResult);
                result.setText(formatVal.format(vKm));
            }
        });

        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonKmtoMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText)findViewById(R.id.editTextMiles);

                double vKm = Double.valueOf(textBoxMiles.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                EditText result = (EditText)findViewById(R.id.editTextResult);
                result.setText(formatVal.format(vMiles));
            }
        });

    }
}
