package com.example.sistemadeeleccionesutpgasconzhong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

     Button bot;
     RadioButton show,show1,show2, show3;
     ImageView img1;
     String candidato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bot = findViewById(R.id.bt1);
        show = findViewById(R.id.radioButton);
        show1 = findViewById(R.id.radioButton2);
        show2= findViewById(R.id.radioButton3);
        show3 = findViewById(R.id.radioButton4);
        img1= findViewById(R.id.imageView2);

        // on click on show text images toast will be shown
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.setImageResource(R.drawable.vivian);
                candidato="vivian";


            }



        });

        // on click on show text images toast will be shown
        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.omar);
                candidato="omar";


            }



        });
        // on click on show text images toast will be shown
        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.setImageResource(R.drawable.martin);
                candidato="martin";


            }





        });

        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.setImageResource(R.drawable.nulo);
                candidato="nulo";


            }





        });



        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String ced= intent.getStringExtra("Cedula");
                Intent in2 = new Intent(getApplicationContext(), MainActivity3.class);
                in2.putExtra("Cedula", ced);
                in2.putExtra("Candi", candidato);
                startActivity(in2);


            }
        });
    }
}