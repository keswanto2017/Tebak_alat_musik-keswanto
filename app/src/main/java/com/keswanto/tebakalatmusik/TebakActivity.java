package com.keswanto.tebakalatmusik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class TebakActivity extends Activity {
    ImageView imageView_tebak;
    EditText editText_jawab;
    Button button_cek;
    String jawaban;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tebak);
        setInitalisasi();
        cekIntent();
        onClickJos();

    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if
                (editText_jawab.getText().toString().equals(jawaban)) {
                    Toast.makeText(TebakActivity.this, "Selamat Jawaban Anda Benar!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this, "Jawaban Anda Ternyata Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_alat_musik = cek.getStringExtra("nama_alat_musik");
        if (nama_alat_musik.equals("piano")){
            imageView_tebak.setImageResource(R.drawable.piano_1);
            jawaban ="piano";
        }
        else if (nama_alat_musik.equals("gitar")){
            imageView_tebak.setImageResource(R.drawable.gitar_1);
            jawaban = "gitar";
        }
        else if (nama_alat_musik.equals("biola")){
            imageView_tebak.setImageResource(R.drawable.biola_1);
            jawaban = "biola";
        }
        else {
            imageView_tebak.setImageResource(R.drawable.drum_1);
            jawaban = "drum";
        }
    }

    private void setInitalisasi() {
        imageView_tebak =
                (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawab =
                (EditText) findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);

    }
}
