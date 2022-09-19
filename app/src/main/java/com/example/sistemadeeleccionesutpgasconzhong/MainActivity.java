package com.example.sistemadeeleccionesutpgasconzhong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bot;
    private EditText tx1;
    private TextView titulo1,titulo2;
    String[] cedulas = {"3-752-1461","8-964-691"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bot = findViewById(R.id.boton1);
        cedulaing =findViewById(R.id.tx1);

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cedulaing==)
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}