package com.example.uasrafliramadhanii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InputDataActivity extends AppCompatActivity {
    private EditText jumlahBayarEditText;
    private EditText alamatEditText;
    private EditText jenisMobilEditText;
    private EditText pembayaranKeEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        // Inisialisasi elemen UI
        jumlahBayarEditText = findViewById(R.id.jumlahBayarEditText);
        alamatEditText = findViewById(R.id.alamatEditText);
        jenisMobilEditText = findViewById(R.id.jenisMobilEditText);
        pembayaranKeEditText = findViewById(R.id.pembayaranKeEditText);
        submitButton = findViewById(R.id.submitButton);

        // Menambahkan listener untuk tombol submit
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan input data
                String jumlahBayar = jumlahBayarEditText.getText().toString();
                String alamat = alamatEditText.getText().toString();
                String jenisMobil = jenisMobilEditText.getText().toString();
                String pembayaranKe = pembayaranKeEditText.getText().toString();

                // Membuat intent untuk pindah ke OutputActivity
                Intent intent = new Intent(InputDataActivity.this, OutputActivity.class);
                intent.putExtra("jumlahBayar", jumlahBayar);
                intent.putExtra("alamat", alamat);
                intent.putExtra("jenisMobil", jenisMobil);
                intent.putExtra("pembayaranKe", pembayaranKe);
                startActivity(intent);
            }
        });
    }
}
