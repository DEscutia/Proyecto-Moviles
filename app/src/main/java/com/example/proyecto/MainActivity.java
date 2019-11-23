package com.example.proyecto;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    private SimpleCursorAdapter adp;
    DaoNotasTareas dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dao=new DaoNotasTareas(this);

        lv=findViewById(R.id.lv);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent( MainActivity.this,AgregarNota.class);
                startActivity(myintent);
            }
        });

        recargaAdaptador();

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int pos, long l) {
                final TareasNotas tn = dao.inflaCursor((Cursor) lv.getItemAtPosition(pos));


                AlertDialog.Builder alerta= new AlertDialog.Builder(MainActivity.this);
                alerta.setMessage("Hola")
                        .setCancelable(false)
                        .setPositiveButton("Holi", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                recargaAdaptador();
                            }
                        }).setNegativeButton("Adios", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog titulo=alerta.create();
                titulo.setTitle("Titulo");
                titulo.show();

                return true;
            }
        });


        SimpleCursorAdapter adp =
                new SimpleCursorAdapter(
                        this,
                        android.R.layout.simple_list_item_2,
                        dao.getAllCursor(),
                        new String[]{"titulo", "Descripcion"},
                        new int[]{android.R.id.text1, android.R.id.text2
                        },
                        SimpleCursorAdapter.IGNORE_ITEM_VIEW_TYPE

                );
        lv.setAdapter(adp);


    }





    private void recargaAdaptadorConCursor(Cursor c) {
        adp = new SimpleCursorAdapter(
                this,
                android.R.layout.simple_list_item_2,
                c,
                new String[]{"titulo", "Descripcion"},
                new int[]{android.R.id.text1, android.R.id.text2
                },
                SimpleCursorAdapter.IGNORE_ITEM_VIEW_TYPE

        );
        lv.setAdapter(adp);
    }

    private void recargaAdaptador() {
        recargaAdaptadorConCursor(dao.getAllCursor());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void Nueva(View view){
        Intent myintent=new Intent(MainActivity.this,AgregarNota.class);
        startActivity(myintent);
    }


}
