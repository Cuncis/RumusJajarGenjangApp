package com.example.rumusjajargenjangapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnHitung;
    TextView tvAngka1, tvAngka2, tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHitung = findViewById(R.id.btn_hitung);
        tvAngka1 = findViewById(R.id.tv_angka1);
        tvAngka2 = findViewById(R.id.tv_angka2);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = tvAngka1.getText().toString().trim();
                String angka2 = tvAngka2.getText().toString().trim();

                if (angka1.isEmpty()) {
                    tvAngka1.setError("Alas harus diisi");
                } else if (angka2.isEmpty()) {
                    tvAngka2.setError("Tinggi harus diisi");
                } else {
                    int jumlah = Integer.parseInt(angka1) * Integer.parseInt(angka2);
                    tvHasil.setText(String.valueOf(jumlah));
                }
            }
        });

    }
}
