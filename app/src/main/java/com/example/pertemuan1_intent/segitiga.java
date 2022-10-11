package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity implements View.OnClickListener {

    EditText editAlas, editTinggi, editLuas;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        editAlas = findViewById(R.id.editAlas);
        editTinggi = findViewById(R.id.editTinggi);
        editLuas = findViewById(R.id.editLuas);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnHitung) {
            String alas = editAlas.getText().toString().trim();
            String tinggi = editTinggi.getText().toString().trim();

            double a = Double.parseDouble(alas);
            double t = Double.parseDouble(tinggi);

            double luas = 0.5 * a * t;
            editLuas.setText(String.valueOf(luas));

        }
    }
}