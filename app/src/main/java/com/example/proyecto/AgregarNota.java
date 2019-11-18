package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

public class AgregarNota extends AppCompatActivity {

    Button btnSeleccionarFecha,btnGuardar;
    TextView txtTitulo, txtDescripcion, txtRecordatorio, tvFecha;
    EditText etTitulo, etDescripcion, etHora;
    RadioButton rbtnNota,rbtnTarea;

    private static final String CERO = "0";
    private static final String BARRA = "/";
    public final Calendar calendar = Calendar.getInstance();
    final int mes = calendar.get(Calendar.MONTH);
    final int dia = calendar.get(Calendar.DAY_OF_MONTH);
    final int año = calendar.get(Calendar.YEAR);
    String fecha="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_nota);

        btnSeleccionarFecha=(Button)findViewById(R.id.btnSeleccionarFecha);
        btnGuardar=(Button)findViewById(R.id.btnGuardar);
        etTitulo=(EditText)findViewById(R.id.etTitulo);
        etDescripcion=(EditText)findViewById(R.id.etDescripcion);
        etHora=(EditText)findViewById(R.id.etHora);
        txtTitulo=(TextView)findViewById(R.id.txtTitulo);
        txtDescripcion=(TextView)findViewById(R.id.txtDescripcion);
        txtRecordatorio=(TextView)findViewById(R.id.txtRecordatorio);
        tvFecha=(TextView)findViewById(R.id.tvFecha);
        rbtnNota=(RadioButton)findViewById(R.id.rbtnNota);
        rbtnTarea=(RadioButton)findViewById(R.id.rbtnTarea);



    }
    public void obtenerFecha(View view){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                //Esta variable lo que realiza es aumentar en uno el mes ya que comienza desde 0 = enero
                final int mesActual = month + 1;
                //Formateo el día obtenido: antepone el 0 si son menores de 10
                String diaFormateado = (dayOfMonth < 10)? CERO + String.valueOf(dayOfMonth):String.valueOf(dayOfMonth);
                //Formateo el mes obtenido: antepone el 0 si son menores de 10
                String mesFormateado = (mesActual < 10)? CERO + String.valueOf(mesActual):String.valueOf(mesActual);
                //Muestro la fecha con el formato deseado
                fecha=year + BARRA + mesFormateado + BARRA + diaFormateado;
                tvFecha.setText(year + BARRA + mesFormateado + BARRA + diaFormateado);
            }
        }, año, mes, dia);
        datePickerDialog.show();
    }




    public void Guardar(View view){
        Intent myintent= new Intent(AgregarNota.this,MainActivity.class);
        startActivity(myintent);
    }
}
