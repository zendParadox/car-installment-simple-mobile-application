package com.example.uasrafliramadhanii;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OutputActivity extends AppCompatActivity {
    private TextView jumlahBayarTextView;
    private TextView alamatTextView;
    private TextView jenisMobilTextView;
    private TextView pembayaranKeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        // Inisialisasi elemen UI
        jumlahBayarTextView = findViewById(R.id.jumlahBayarTextView);
        alamatTextView = findViewById(R.id.alamatTextView);
        jenisMobilTextView = findViewById(R.id.jenisMobilTextView);
        pembayaranKeTextView = findViewById(R.id.pembayaranKeTextView);

        // Menerima data dari intent
        String jumlahBayar = getIntent().getStringExtra("jumlahBayar");
        String alamat = getIntent().getStringExtra("alamat");
        String jenisMobil = getIntent().getStringExtra("jenisMobil");
        String pembayaranKe = getIntent().getStringExtra("pembayaranKe");

        // Menampilkan data pada TextView
        jumlahBayarTextView.setText("Jumlah Pembayaran: " + jumlahBayar);
        alamatTextView.setText("Alamat: " + alamat);
        jenisMobilTextView.setText("Jenis Mobil: " + jenisMobil);
        pembayaranKeTextView.setText("Pembayaran Ke: " + pembayaranKe);
    }
}
