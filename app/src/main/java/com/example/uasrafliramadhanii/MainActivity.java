package com.example.uasrafliramadhanii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi elemen UI
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Menambahkan listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan input username dan password
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Memeriksa username dan password yang benar
                if (username.equals("Rafli Ramadhani") && password.equals("11220086")) {
                    // Membuat intent untuk pindah ke InputDataActivity
                    Intent intent = new Intent(MainActivity.this, InputDataActivity.class);
                    startActivity(intent);
                } else {
                    // Menampilkan pesan kesalahan jika username atau password salah
                    Toast.makeText(MainActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
