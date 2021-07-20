package com.keswanto.tebakalatmusik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_piano,imageView_gitar,imageView_biola,imageView_drum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInisialisasi();
        onClickMantab();
    }
    private void onClickMantab() {
        imageView_piano.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent p = new
                    Intent(MainActivity.this, TebakActivity.class);
            p.putExtra("nama_alat_musik", "piano");
            startActivity(p);
        }
        });
        imageView_gitar.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
                    Intent g = new
                            Intent(MainActivity.this, TebakActivity.class);
                    g.putExtra("nama_alat_musik", "gitar");
                    startActivity(g);
                }
        });
        imageView_biola.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent b = new
                            Intent(MainActivity.this, TebakActivity.class);
                    b.putExtra("nama_alat_musik", "biola");
                    startActivity(b);
                }
                });
        imageView_drum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent d = new
                        Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama_alat_musik","drum");
                startActivity(d);
            }
            });
    }
    private void setInisialisasi(){
        imageView_gitar = (ImageView)findViewById(R.id.imageView_gitar);
        imageView_piano = (ImageView)findViewById(R.id.imageView_piano);
        imageView_biola = (ImageView)findViewById(R.id.imageView_biola);
        imageView_drum = (ImageView)findViewById(R.id.imageView_drum);
    }
}