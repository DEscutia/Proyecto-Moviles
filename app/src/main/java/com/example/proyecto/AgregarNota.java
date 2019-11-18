package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Calendar;

public class AgregarNota extends AppCompatActivity {

    Button btnSeleccionarFecha, btnGuardar, btnHora;
    TextView txtTitulo, txtDescripcion, txtRecordatorio, tvFecha, tvHora;
    EditText etTitulo, etDescripcion;
    RadioButton rbtnNota, rbtnTarea;
    final DaoNotasTareas dao =new DaoNotasTareas(this);

    private static final String CERO = "0";
    private static final String BARRA = "/";
    public final Calendar calendar = Calendar.getInstance();
    final int mes = calendar.get(Calendar.MONTH);
    final int dia = calendar.get(Calendar.DAY_OF_MONTH);
    final int año = calendar.get(Calendar.YEAR);
    String fecha = "";
    private int horas, minutos;

    private int Tarea=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_nota);

        btnSeleccionarFecha = (Button) findViewById(R.id.btnSeleccionarFecha);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        etTitulo = (EditText) findViewById(R.id.etTitulo);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);
        tvHora = (TextView) findViewById(R.id.tvHora);
        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);
        txtRecordatorio = (TextView) findViewById(R.id.txtRecordatorio);
        tvFecha = (TextView) findViewById(R.id.tvFecha);
        rbtnNota = (RadioButton) findViewById(R.id.rbtnNota);
        rbtnTarea = (RadioButton) findViewById(R.id.rbtnTarea);
        btnHora = (Button) findViewById(R.id.btnHora);


    }

    public void obtenerFecha(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                //Esta variable lo que realiza es aumentar en uno el mes ya que comienza desde 0 = enero
                final int mesActual = month + 1;
                //Formateo el día obtenido: antepone el 0 si son menores de 10
                String diaFormateado = (dayOfMonth < 10) ? CERO + String.valueOf(dayOfMonth) : String.valueOf(dayOfMonth);
                //Formateo el mes obtenido: antepone el 0 si son menores de 10
                String mesFormateado = (mesActual < 10) ? CERO + String.valueOf(mesActual) : String.valueOf(mesActual);
                //Muestro la fecha con el formato deseado
                fecha = year + BARRA + mesFormateado + BARRA + diaFormateado;
                tvFecha.setText(year + BARRA + mesFormateado + BARRA + diaFormateado);
            }
        }, año, mes, dia);
        datePickerDialog.show();
    }


    public void obtenerHora(View view) {
        final Calendar c = Calendar.getInstance();
        horas = c.get(Calendar.HOUR_OF_DAY);
        minutos = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tvHora.setText(hourOfDay + ":" + minute);
            }
        }, horas, minutos, false);
        timePickerDialog.show();
    }

    public void Nota(View view) {
        txtRecordatorio.setVisibility(View.GONE);
        tvFecha.setVisibility(View.GONE);
        btnSeleccionarFecha.setVisibility(View.GONE);
        tvHora.setVisibility(View.GONE);
        btnHora.setVisibility(View.GONE);
        Tarea=0;
    }

    public void Tarea(View view) {
        txtRecordatorio.setVisibility(View.VISIBLE);
        tvFecha.setVisibility(View.VISIBLE);
        btnSeleccionarFecha.setVisibility(View.VISIBLE);
        tvHora.setVisibility(View.VISIBLE);
        btnHora.setVisibility(View.VISIBLE);
        Tarea=1;
    }

    public void Guardar(View view){
        Intent myintent = new Intent(AgregarNota.this, MainActivity.class);
        startActivity(myintent);

        android.text.format.Time today=new Time(android.text.format.Time.getCurrentTimezone());
        String lol=today.toString();

        if(Tarea==1){

            dao.insertarNota(new TareasNotas(0,etTitulo.getText().toString(),
                    etDescripcion.getText().toString(),lol,tvFecha.getText().toString(),
                    tvHora.getText().toString(),Tarea));

        }else{

            dao.insertarNota(new TareasNotas(0,etTitulo.getText().toString(),
                    etDescripcion.getText().toString(), Tarea));

        }

    }








}
