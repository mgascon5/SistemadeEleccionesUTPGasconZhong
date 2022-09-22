package com.example.sistemadeeleccionesutpgasconzhong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class MainActivity3 extends AppCompatActivity {

    TextView can,can2,can3,prc,prc2,prc3;
    Button botonv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        botonv = findViewById(R.id.botonv);
        can=findViewById(R.id.can);
        can2=findViewById(R.id.can2);
        can3=findViewById(R.id.can3);
        prc=findViewById(R.id.prc);
        prc2=findViewById(R.id.prc2);
        prc3=findViewById(R.id.prc3);

        Intent in2 = getIntent();

        String ced= in2.getStringExtra("Cedula");
        String cand= in2.getStringExtra("Candi");





        if (cand.equals("omar")){

            Datos.omarv=Datos.omarv+1;

            Datos.tot=Datos.tot +1;



        }

        else if (cand.equals("vivian")){

            Datos.vivianv= Datos.vivianv+ 1;

            Datos.tot=Datos.tot +1;


        }

        else {
            Datos.martinv= Datos.martinv+ 1;

            Datos.tot=Datos.tot +1;

        }

        Datos.porcentaje1=(((float)Datos.omarv/(float)Datos.tot)*100);
        Datos.porcentaje2=(((float)Datos.vivianv/(float)Datos.tot)*100);
        Datos.porcentaje3=(((float)Datos.martinv/(float)Datos.tot)*100);

        NumberFormat formatter = new DecimalFormat("#0.00");

        prc.setText("Porcentaje de votos: "+  formatter.format(Datos.porcentaje1) +"%");
        prc2.setText("Porcentaje de votos: "+  formatter.format(Datos.porcentaje2)+"%");
        prc3.setText("Porcentaje de votos: "+  formatter.format(Datos.porcentaje3)+"%");

        botonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x=Arrays.asList(Datos.cedulas).indexOf(ced);
                Datos.cedulas[x]=" ";

                Intent inP = new Intent(getApplicationContext(), MainActivity.class);
                inP.putExtra("Cedula", ced);
                startActivity(inP);
            }



        });



    }
}