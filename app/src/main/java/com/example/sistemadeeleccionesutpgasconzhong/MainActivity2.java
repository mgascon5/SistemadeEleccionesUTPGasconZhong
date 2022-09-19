package com.example.sistemadeeleccionesutpgasconzhong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

     Button bot;
     TextView text2;
     int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bot = findViewById(R.id.bt1);
        text2 = findViewById(R.id.tv2);

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String ced= intent.getStringExtra("Cedula");

                text2.setText(ced);
            }
        });
    }
}