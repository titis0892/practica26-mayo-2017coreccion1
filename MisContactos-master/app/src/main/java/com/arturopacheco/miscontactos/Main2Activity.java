package com.arturopacheco.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button agregar;
    private TextView nombre;
    private TextView telefono;
    private TextView correo;

    private String editnombre;
    private String editTel;
    private String editcorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        agregar= (Button)findViewById(R.id.btnagregar);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agregar = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(agregar);

            }
        });

        Bundle bundle = getIntent().getExtras();

        editnombre = bundle.getString("nombre");
        editTel = bundle.getString("telefono");
        editcorreo = bundle.getString("correo");



        nombre = (TextView) findViewById(R.id.txtnombre);
        telefono= (TextView) findViewById(R.id.txttelefono);
        correo = (TextView) findViewById(R.id.txtcorreo);

        nombre.setText(editnombre);
        telefono.setText(editTel);
        correo.setText(editcorreo);

    }

    public void EditData (View v) {
        Intent intent = new Intent(this, DetallesContacto.class);


        intent.putExtra("nombre", editnombre);
        intent.putExtra("telefono", editTel);
        intent.putExtra("correo", editcorreo);

        startActivity(intent);
    }
}
