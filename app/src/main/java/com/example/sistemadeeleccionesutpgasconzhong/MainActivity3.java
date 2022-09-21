package com.example.sistemadeeleccionesutpgasconzhong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView can,can2,can3,prc,prc2,prc3;
    Button botonv;
    int omarv,vivanv,martinv,tot;
    int porcentaje1,porcentaje2,porcentaje3;

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

            omarv=omarv+1;

            tot=+1;



        }

        else if (cand.equals("vivian")){

            vivanv=vivanv + 1;

            tot=+1;


        }

        else {
            martinv =martinv + 1;

            tot=+1;

        }

        porcentaje1=omarv/tot;
        porcentaje2=vivanv/tot;
        porcentaje3=martinv/tot;

        prc.setText("Porcentaje de votos: "+ porcentaje1 +"%");
        prc2.setText("Porcentaje de votos: "+ porcentaje2+"%");
        prc3.setText("Porcentaje de votos: "+ porcentaje3+"%");

        botonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inP = new Intent(getApplicationContext(), MainActivity.class);
                inP.putExtra("Cedula", ced);
                startActivity(inP);
            }



        });



    }
}