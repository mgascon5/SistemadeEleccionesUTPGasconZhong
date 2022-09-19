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
    String[] cedulas = {"8-944-327", "3-740-1394", "20-53-4282", "8-943-1867", "8-937-503", "8-952-2444", "8-943-12", "8-986-549", "8-957-1827", "8-940-1311", "8-863-1620", "8-964-691",
            "8-954-1126", "8-1039-1537", "8-925-1168", "8-940-1505", "8-938-925", "3-743-2493", "E-8-169755", "8-971-1811", "8-940-408", "8-937-1640", "8-939-1578", "8-942-1406",
            "6-722-724", "8-941-1215", "8-962-1218", "8-941-924", "8-980-2414", "3-742-2055", "8-942-1192", "8-904-1189", "8-959-857", "8-964-1554", "8-1066-1018", "8-1055-701",
            "8-970-242", "3-752-1461", "3-745-950"};



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

                if (Arrays.asList(cedulas).contains(cedulaing)) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("Cedula", cedulaing);
                startActivity(intent);

            }

                else {
                    Toast.makeText(getApplicationContext(),"Su cédula no se encuentra en el sistema ingrese otra nuevamente ",Toast.LENGTH_SHORT).show();
                }
        }});
    }
    }

