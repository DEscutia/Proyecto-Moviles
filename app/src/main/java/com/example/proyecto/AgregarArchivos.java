package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AgregarArchivos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_archivos);
    }


    public void Agregar(View view){
        Intent myintent= new Intent(AgregarArchivos.this,DetalleNT.class);
        startActivity(myintent);
    }
}
