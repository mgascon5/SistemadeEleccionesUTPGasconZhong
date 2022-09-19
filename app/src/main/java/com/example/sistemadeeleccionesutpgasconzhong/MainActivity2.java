package com.example.sistemadeeleccionesutpgasconzhong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

     Button boton1;
     TextView textv2;
     String[] cedulas = {"3-752-1461","8-964-691"};
     int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boton1 = findViewById(R.id.button);
        textv2 =findViewById(R.id.tv2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            textv2.setText("Cedula: "+cedulas);


            }
    });
    }
}