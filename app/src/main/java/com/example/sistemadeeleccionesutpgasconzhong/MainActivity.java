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

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private Button bot;
    private EditText tx1;
    private TextView titulo1,titulo2;
    int x= Datos.validar.length;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bot = findViewById(R.id.boton1);
        tx1 =findViewById(R.id.tx1);







        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String cedulaing = tx1.getText().toString();





                    if (Arrays.asList(Datos.cedulas).contains(cedulaing)) {

                        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                        intent.putExtra("Cedula", cedulaing);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Su cédula no se encuentra en el sistema ingrese otra nuevamente o usted ya voto", Toast.LENGTH_SHORT).show();
                    }
                }


        });
    }
    }

